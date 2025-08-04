def is_lucky(x):
    s = str(x)
    return len(set(s)==len(s))

def main():
    n = input()
    for _ in range(n):
        x= int(input())
        while not is_lucky(x):
            x = x + 1
        print(x)

if __name__ == "__main__":
    main()
