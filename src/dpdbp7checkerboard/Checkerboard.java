/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpdbp7checkerboard;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author daniel
 */
public class Checkerboard {
    private int numRows = 8;
    private int numCols = 8;
    private double boardWidth;
    private double boardHeight;
    private Color lightColor = Color.RED;
    private Color darkColor = Color.BLACK;
    private Rectangle rectangle;
    private double rectangleWidth;
    private double rectangleHeight;
    private AnchorPane board = null;
    
    public Checkerboard(int numRows, int numCols, double boardWidth, double boardHeight, Color lightColor, Color darkColor){
        setNumRows(numRows);
        setNumCols(numCols);
        setBoardWidth(boardWidth);
        setBoardHeight(boardHeight);
        setLightColor(lightColor);
        setDarkColor(darkColor);
        setRectangleWidth(boardWidth/(double)numCols);
        setRectangleHeight(boardHeight/(double)numRows);
    }
    
    public Checkerboard(int numRows, int numCols, double boardWidth, double boardHeight){
        this(numRows, numCols, boardWidth, boardHeight, Color.RED, Color.BLACK);
    }
    
    public AnchorPane build(){
        board = new AnchorPane();
        
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if ((row%2==0 && col%2==0) || (row%2==1 && col%2==1)){
                    rectangle = new Rectangle(rectangleWidth, rectangleHeight, lightColor);
                } else {
                    rectangle = new Rectangle(rectangleWidth, rectangleHeight, darkColor);
                }
                board.setTopAnchor(rectangle, (double) (col*rectangleHeight+(boardHeight-rectangleHeight*numCols)));
                board.setLeftAnchor(rectangle, (double) (row*rectangleWidth+(boardWidth-rectangleWidth*numRows)));
                board.getChildren().addAll(rectangle);              
            }
        }

        return board;
    }
    
    private void setNumRows(int numRows){
        this.numRows = numRows;
    }
    
    private void setNumCols(int numCols){
        this.numCols = numCols;
    }
    
    private void setBoardWidth(double boardWidth){
        this.boardWidth = boardWidth;
    }
    
    private void setBoardHeight(double boardHeight){
        this.boardHeight = boardHeight;
    }
    
    private void setLightColor(Color lightColor){
        this.lightColor = lightColor;
    }
    
    private void setDarkColor(Color darkColor){
        this.darkColor = darkColor;
    }
    
    private void setRectangleWidth(double rectangleWidth){
        this.rectangleWidth = rectangleWidth;
    }
    
    private void setRectangleHeight(double rectangleHeight){
        this.rectangleHeight = rectangleHeight;
    }
    
    public AnchorPane getBoard(){
        return this.board;
    }
    
    public int getNumRows(){
        return this.numRows;
    }
    
    public int getNumCols(){
        return this.numCols;
    }
    
    public double getWidth(){
        return this.boardWidth;
    }
    
    public double getHeight(){
        return this.boardHeight;
    }
    
    public Color getLightColor(){
        return this.lightColor;
    }
    
    public Color getDarkColor(){
        return this.darkColor;
    }
    
    public double getRectangleWidth(){
        return this.rectangleWidth;
    }
    
    public double getRectangleHeight(){
        return this.rectangleHeight;
    }
}
