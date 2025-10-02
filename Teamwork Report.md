**Case Study Documentation: A Food Delivery App**

Course: Data Structures and Algorithms

Instructor: Dr. Rithwik M, Vishnuvarthan Rajagopal

Date: September 30, 2025
## Team Members:
- R Srija - CB.SC.U4CSE24245 (Foundational Data Models & Data Provider)
- A Ravi Teja Reddy- CB.SC.U4CSE24202 (Core Algorithms - Sorting & Searching)
- M K Bhargava Sri Sai - CB.SC.U4CSE24268 (Application Flow & Admin Panel)
- K B Kali Priya - CB.SC.U4CSE24230 (Customer-Facing Experience)
# 1\. Project Overview & Objectives
This project serves as a case study on the application of efficient data structures given by Dr. Rithwik to solve a real-world problem. Here we developed a console-based Food Delivery application using Java. Which allows users to find restaurants based on the location from the city center. The primary technical challenge was to implement a search functionality that could quickly and efficiently search restaurants within a given distance range from the user's location.
### Our main objectives were:
- To connect a fundamental data structure concept to a practical, real-world scenario.
- To implement and analyze an efficient algorithm for performing range-based searches.
- To provide formal proof and justification for why our chosen data structure is the most optimal for this specific real-world scenario.
- To work collaboratively as a team, ensuring equal participation and clear communication throughout the project.

# 2\. Team Collaboration and Process
A preplanned workflow and effective teamwork were crucial in making this case study a success. We organized our process around a series of formal meetings to ensure alignment and seamless integration of all components.
### Meeting 1: Brainstorming and Initial Design
- **Discussion:** The first meeting focused on defining the project scope and selecting an appropriate real-world problem. We collectively decided on a "Food Delivery App" as it presented a clear use case for a range of queries. 
- **Data Structure Analysis:** We considered two primary candidates, a **Segment Tree** and a **Sorted Array with Binary Search**. The Segment Tree offered query time but came with significant implementation complexity.
### Meeting 2: Finalizing the structure on how to work and assigning roles to each other
- **Discussion:** Ravi presented a successful proof-of-concept for the binary search approach, confirming its high efficiency. Based on this, the team formally adopted the sorted array approach, as it offered the best balance of performance and implementation for our use case.
- **Outcome:** We finalized the project structure and allocated roles and responsibilities to each team member, ensuring a clear division of work.
### Meeting 3: Code Integration and System Testing
- **Discussion:** In this session we dedicated it to merging the four individual code modules. The clear role definitions from the previous meeting, which led to smooth integration.
- **Outcome:** We conducted end-to-end testing of the integrated application.

# 3\. System Architecture and Design
Our application is built on four logical components, with each team member having a component of their own. 

- **Module 1:** Data Models: This module specifies the data structures used by the software and contains items such as Restaurant and MenuItem. To act as an in-memory data source, a DataProvider class was also created. 
- **Module 2:** The main technological element is this. It consists of two classes: RestaurantSorter, which employs Insertion Sort to organize restaurants by location, and RestaurantFinder, which effectively locates any restaurant within a certain radius using binary search. 
- **Module 3:** As the primary controller, this module manages the admin user interface's logic as well as the top-level application flow and user role selection (Admin/Customer).
- **Module 4: ** This module encapsulates the entire customer-facing workflow. It is responsible for storing user location, processing search requests by calling the required functions, and managing the order and checkout process.
# 4\. Complexity Analysis & Justification
### A formal complexity analysis of our core algorithm was conducted to validate its efficiency.
- **Preprocessing (Sorting):** Where N is the total number of restaurants, the insertionSortByLocation technique's temporal complexity is. This is an initial cost that is incurred at the beginning of a user session. Although it is asymptotically slower than algorithms, it is simple to construct and performs well for the project's moderate data scale.
- **Querying (searching):** The main search function is quite effective.  A binary search that runs in time is needed to get the location range's start and end indices.  It takes time to retrieve the K results within that range.  Consequently, the overall query time is ideal and guarantees a user experience that is responsive.
###
### Proof of Optimality for the Scenario
We show that the optimal solution for this specific problem is our choice of a sorted array with binary search. While a segment tree also provides query time, its implementation is far more challenging. Since the list of restaurants stays the same for a single user session, the one-time preprocessing cost of sorting is an acceptable trade-off for a considerably simpler solution. This decision demonstrates the ability to strike a compromise between algorithmic purity and practical software engineering ideas.

# 5\. Conclusion
The project successfully demonstrated the application of fundamental data structures and algorithms to create an efficient solution for a real-world problem. The approach chosen was a sorted array with binary search provides an optimal balance of performance and implementation. Furthermore, the project’s success was supported by our collaborative team process involving clear communication and joint problem solving.  

