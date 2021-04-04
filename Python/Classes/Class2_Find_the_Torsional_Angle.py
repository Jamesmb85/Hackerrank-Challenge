"""  
You are given four points A,B,C and D in a 3-dimensional Cartesian coordinate system. 
You are required to print the angle between the plane made by the points A,B,C and B,C,D in degrees(not radians). 
Let the angle be PHI.

COS(PHI) = (X.Y)/|X||Y| where X = ABxBC and Y = BCxCD.

Here, X.Y means the dot product of X and Y, and  ABxCD means the cross product of vectors AB and BC. Also, AB = B-A.

Input Format

One line of input containing the space separated floating number values of the X,Y, and Z coordinates of a point.

Output Format

Output the angle correct up to two decimal places.

Sample Input

0 4 5
1 7 6
0 5 9
1 7 2

Sample Output

8.19


"""

import math

class Points(object):
	#constructor takes 3 arguments
    def __init__(self, x, y, z):
        self.x = x
        self.y = y
        self.z = z

    #over ride the sub dunder method
    #no is an instance of the Points class so we need to return the result of sustracting two instances
    def __sub__(self, no):
		#a Points instance is returned
        return Points( (self.x - no.x) , (self.y - no.y) , (self.z - no.z) )

    def dot(self, no):
		#a scalar is returned
		#a · b = ax * bx + ay * by is the formula for the dot product
        return (self.x * no.x) +(self.y * no.y) + (self.z * no.z)

    def cross(self, no):
		#a Points instance is returned
		"""
		cx = aybz − azby
		cy = azbx − axbz
		cz = axby − aybx	

		is the formula for the dot product 
		
		"""
        return Points( (self.x * no.y - self.y * no.x) , (self.y * no.z - self.z * no.y) , (self.x * no.z - self.z * no.x) )
        
    def absolute(self):
        return pow((self.x ** 2 + self.y ** 2 + self.z ** 2), 0.5)

if __name__ == '__main__':
	#create an list
    points = list()
    for i in range(4):
		#take the input and cast the string list created from input().split() as a float using the map function.  Assigned the values to a
        a = list(map(float, input().split()))
		#append a to the list
        points.append(a)

	"""tuple unpacking of the Points instances.
	Points(*points[0]) is broken down in the following manner.
	points[0] is the first list of numbers in the points array
	*points[0] unpacks the elements in that list and the result is Point(0,4,5) since [0,4,5] is the first list in a list of list
	Point(0,4,5) is an instance from the Point class and it is assigned to a
	
	Repeat for the other variables
	"""
    a, b, c, d = Points(*points[0]), Points(*points[1]), Points(*points[2]), Points(*points[3])
	"""
	The __sub__ method is called for the a and b instances. 
	The result calls the cross method on the result of c-b calling the __sub__method 
	
	Repeat for the y variable
	"""
    x = (b - a).cross(c - b)
    y = (c - b).cross(d - c)
	"""
	x and y are Point instances. x calls the dot method with the point y as the parameter
	x and y instances call the absolute method
	"""
    angle = math.acos(x.dot(y) / (x.absolute() * y.absolute()))

    print("%.2f" % math.degrees(angle))