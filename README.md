# Number-of-Boomerangs
You are given n points in the plane that are all distinct. A boomerang is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (the order of the tuple matters)
Explanation:
We iterate through each point i and calculate the distance to every other point j.

Use a HashMap to count how many points are at each unique distance from i.

For each distance group with freq points, there are freq * (freq - 1) boomerangs possible (order matters).

Accumulate the total count of such valid boomerang combinations...
