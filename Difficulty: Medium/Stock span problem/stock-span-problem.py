#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends
class Solution:
    def calculateSpan(self, arr):
        ms, ans = [(10**5 + 1, -1)], []
        for i, a in enumerate(arr):
            while ms[-1][0] <= a:
                ms.pop()
            ans.append(i - ms[-1][1])
            ms.append((a, i))
        return ans
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        #write code here

#{ 
 # Driver Code Starts.
#Initial Template for Python 3

if __name__ == "__main__":
    t = int(input())
    while t > 0:
        arr = list(map(int, input().split()))
        ob = Solution()
        ans = ob.calculateSpan(arr)
        print(*ans)
        print("~")
        t -= 1
# } Driver Code Ends