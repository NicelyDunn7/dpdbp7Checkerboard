# Retrospective: Checkerboard

### 1. Design Decisions Reflection
**How did you do?** I received a 100% on the original assignment.  
**What did you get right?** Overall, I think I did well on the assignment and just had some minor deviations in the design of my code compared to the posted solution.  
**What did you get wrong?** I completed the assignment and met all requirements, however I did have trouble getting the vertical sizing of the board compared to the scene. It would be very close, but the MenuBar caused some issues I believe.  
**What did you do differently (and possibly better) than what was posted in the solution?** I used a different rectangle constructor, which I believe was a worse decision because mine required me to set anchors to place them, while the solution constructor did so automatically. Next, I took a somewhat different approach to the Checkerboard constructors, albeit still meeting the requirements and functioning properly. Lastly, I did not store values such as the colors, gride size, or board size in the controller, which I think was a better decision as it leaves the data and state to the model, rather than having it stored with the model and the controller.  
**What was hard to do?** I had the most difficulty simply trying to understand JavaFX and FXML (I took CS 3330 before that was taught as part of the curriculum).  

### 2. Required Knowledge and Understanding
How well did you understand the programming concepts and foundational knowledge needed to complete the challenge? 

### 3. Assignment Requirements Met
How well did you meet the requirements as set out in the challenge? 
What requirements did you not meet correctly (if any)? 

### 4. Submission to Solution Comparison
How well does your solution match the posted solution? 
What is different? 

Checkerboard:
  Rectangle as an attribute
  Different constructor approach
  No setprefsize
  Called different rectangle contstructors, requiring me to set anchors
Checkers:
  Used startable.java
CheckerUI:
  AnchorPane instead of StackPane
CheckersUIController:
  Used default colors in construction, default size in start constructor call
  Used If-Else ladder for switching color/size, didn't store values just new board

### 5. Future Improvements and Understanding
How could you improve going forward? 
What don't you still understand that was required for the challenge? 
