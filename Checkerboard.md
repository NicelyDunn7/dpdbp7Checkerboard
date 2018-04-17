# Retrospective: Checkerboard

### 1. Design Decisions Reflection
**How did you do?** I received a 100% on the original assignment.  
**What did you get right?** Overall, I think I did well on the assignment and just had some minor deviations in the design of my code compared to the posted solution.  
**What did you get wrong?** I completed the assignment and met all requirements, however I did have trouble getting the vertical sizing of the board compared to the scene. It would be very close, but the MenuBar caused some issues I believe.  
**What did you do differently (and possibly better) than what was posted in the solution?** I used a different rectangle constructor, which I believe was a worse decision because mine required me to set anchors to place them, while the solution constructor did so automatically. Next, I took a somewhat different approach to the Checkerboard constructors, albeit still meeting the requirements and functioning properly. Lastly, I did not store values such as the colors, gride size, or board size in the controller, which I think was a better decision as it leaves the data and state to the model, rather than having it stored with the model and the controller.  
**What was hard to do?** I had the most difficulty simply trying to understand JavaFX and FXML (I took CS 3330 before that was taught as part of the curriculum).  

---

### 2. Required Knowledge and Understanding
**How well did you understand the programming concepts and foundational knowledge needed to complete the challenge?** I understood the programming concepts and foundational knowledge required to complete the challenge minus GUI programming in Java, particularly using JavaFX and FXML. As I stated above, I took CS 3330 before those were taught in the curriculum.  

---

### 3. Assignment Requirements Met
**How well did you meet the requirements as set out in the challenge?** As far as I can tell, I met all requirements set out in the challenge documentation.  
**What requirements did you not meet correctly (if any)?** I believe I met all requirements correctly.  

---

### 4. Submission to Solution Comparison
**How well does your solution match the posted solution?** For the most part, my code has the same general structure as the posted solution with, in my opinion, minor changes between implementation. Generally they appear to have the same flow and structure.  
**What is different?** In addition to the three differences listed in section 1 (different rectangle constructor, slightly different approach to the Checkerboard constructor, and not storing the rows/cols, colors, and board sizes in the controller) there are additional differences. Smaller ones include things such as storing the Rectangle object as an attribute in my Checkerboard model or setting the prefsize for the scene in the model compared to in the FXML. Also, we used a somewhat different approach to employing the default rows/cols and color scheme in the initial call to the Checkerboard constructor. The two biggest differences I noted between the codebases were that I used a startable controller, and that I used an AnchorPane rather than a StackPane, although that was a requirement of the challenge. All in all, the my code and the solution were quite close.  
  
---

### 5. Future Improvements and Understanding
**How could you improve going forward?** First, I think that I could dive deeper and discover the issue I was having with vertical sizing of the board relative to the MenuBar and scene. Second, I think that I could cut out the inclusion of the startable interface, as it was clearly unnecessary. Third, I think that I could improve by using the solution's rectangle constructor to avoid the necessity of having to anchor it to the pane.  
**What don't you still understand that was required for the challenge?** I believe I understand all that was required for the challenge.  
