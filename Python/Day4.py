"""

Day4: Program to find volume of sphere and cylinder

"""

print("--------------SPHERE---------------")
r= float(input("\nEnter Radius of Sphere: "))
volume = (4/3) * 3.14 * r * r * r
print("Volume of Sphere is: ",round(volume,2))

print("\n\n--------------CYLINDER---------------")
r= float(input("\nEnter Radius of Cylinder: "))
h= float(input("Enter Height of Cylinder:  "))
volume = 3.142 * r * r * h
print("Volume of cylinder is: ",round(volume,2))



"""

Input and Output: 
--------------SPHERE---------------

Enter Radius of Sphere: 20
Volume of Sphere is:  33493.33


--------------CYLINDER---------------

Enter Radius of Cylinder: 30
Enter Height of Cylinder:  50
Volume of cylinder is:  141390.0


"""
