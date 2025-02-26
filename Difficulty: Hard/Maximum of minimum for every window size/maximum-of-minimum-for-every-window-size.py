
class Solution:
    def maxOfMins(self, arr):
        n = len(arr)
        nser = []
        stack = []
       
        for i in reversed(range(n)):
            while stack and stack[-1][0]>=arr[i]:
                stack.pop()
            if stack:
                nser.append(stack[-1][1])
            else:
                nser.append(n)
            stack.append((arr[i],i))
        nser.reverse()
        nsel = []
        stack = []
        
        for i in range(n):
            while stack and stack[-1][0]>=arr[i]:
                stack.pop()
            if stack:
                nsel.append(stack[-1][1])
            else:
                nsel.append(-1)
            stack.append((arr[i],i))
        result = [0]*n
        # print(nser,nsel)
        for i in range(n):
            ai = nser[i]-nsel[i]-2
            # print(ai,arr[i])
            result[ai] = max(result[ai],arr[i])
        for i in reversed(range(1,n)):
            result[i-1] = max(result[i],result[i-1])
        return result


#{ 
 # Driver Code Starts
if __name__ == "__main__":
    t = int(input())
    for _ in range(t):
        arr = list(map(int, input().split()))
        solution = Solution()
        result = solution.maxOfMins(arr)
        print(" ".join(map(str, result)))
        print("~")
# } Driver Code Ends