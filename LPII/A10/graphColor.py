m = int(input("Enter Number of Max colors: "))
g = {}
n = int(input("Enter number of edges: "))

for i in range(n):
	a,b = map(int, input().split())
	if g.get(a) == None:
		g[a] = []
	g[a].append(b)
	if g.get(b) == None:
		g[b] = []
	g[b].append(a)

"""
3
6
0 1
0 2
0 3
1 2
2 3
3 4
"""
posCol = ["red","orange","violet","blue","yellow","green","indigo"]

def canColor(g,n,col,colList):
	for child in g[n]:
		if colList[child] == posCol[col]:
			return False
	return True
			
def graphColoring(g,m,v,n,colList):
	if n == v:
		return True

	for col in range(m):
		if canColor(g,n,col,colList):
			colList[n] = posCol[col]
			if graphColoring(g,m,v,n+1,colList) == True:
				return True
			colList[n] = -1

colList = {}			
for i in g.keys():
	colList[i] = -1	

if graphColoring(g,m,len(g.keys()),0,colList):
	print(colList)
else:
	print("Can't Color using ColorList!")
	
