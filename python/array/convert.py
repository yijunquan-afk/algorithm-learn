class Solution:
     def convert(self, s: str, numRows: int) -> str:
        n = len(s)
        if numRows == 1:
            return s
        if numRows == 2:
            return "".join([s[i] for i in range(n) if i % 2 == 0]) + "".join([s[i] for i in range(n) if i % 2 == 1])
        
        arr =[list() for _ in range(numRows)] 
        mode = 0
        cnt = 0
        for i in range(n):
            if mode == 0 and cnt == numRows:
                mode = 1
                cnt = 0
            elif mode == 1 and cnt == numRows - 2:
                mode = 0
                cnt = 0
            if mode == 0:
                arr[cnt].append(s[i])
                cnt += 1
            else:
                arr[numRows-2-cnt].append(s[i])
                cnt += 1
        res = ""
        for r in arr:
            res += "".join(r)
        return res
                    

solution = Solution()
solution.convert("PAYPALISHIRING", 3)