from collections import deque, defaultdict
from typing import List
class Solution:
    def findAllRecipes(self, recipes: List[str], ingredients: List[List[str]], supplies: List[str]) -> List[str]:
        graph = defaultdict(list)
        degree = {}
        for recipe, ingredient in zip(recipes, ingredients):
            for i in ingredient:
                graph[i].append(recipe) # 从这道菜的原材料向这道菜连边
            degree[recipe] = len(ingredient)
        result = []
        q = deque(supplies) # 拓扑排序（用初始原材料当队列）
        while q:
            cur = q.popleft()
            for r in graph[cur]:
                degree[r] -= 1
                if degree[r] == 0:
                    result.append(r)
                    q.append(r)
        return result
        # def canCook(ingredients, supplies):
        #     for i in ingredients:
        #         if i not in supplies:
        #             return False
        #     return True
        # n = len(recipes)
        # graph = defaultdict(list)
        # in_degree = [0] * n
        # for i in range(n):
        #     for j in range(n):
        #         if recipes[j] in ingredients[i]:
        #             graph[j].append(i)
        #             in_degree[i] += 1
        # q = deque()
        # for i in range(n):
        #     if in_degree[i] == 0:
        #         q.append(i)
        # result = []
        # while q:
        #     cur = q.popleft()
        #     if canCook(ingredients[cur], supplies):
        #         result.append(recipes[cur])
        #         supplies.append(recipes[cur])
        #     else:
        #         if  q:
        #             continue
        #         else:
        #             break
        #     for t in graph[cur]:
        #         in_degree[t] -= 1
        #         if in_degree[t] == 0:
        #             q.append(t)
        # return result


    


if __name__ == "__main__":
    recipes = ["qxyj","vawos","nkov","bec","qiabz"]
    ingredients =[["mxf"],["iy","qxyj","nkov","qiabz","bec"],["nw","xutnl","e"],["eep","km","nw","xutnl","e","iy","vawos","qxyj","qiabz"],["nyhyc"]]
    supplies = ["nw","eep","iy","e","xutnl","km"]
    print(Solution().findAllRecipes(recipes, ingredients, supplies))
    
