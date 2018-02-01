/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpdbp7checkerboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author daniel
 */
public class CheckerboardFXMLController implements Initializable, Startable {
    @FXML public AnchorPane board;
    @FXML public MenuItem sixteen;
    @FXML public MenuItem ten;
    @FXML public MenuItem eight;
    @FXML public MenuItem three;
    @FXML public MenuItem defaultColor;
    @FXML public MenuItem blueColor;
    @FXML public MenuBar menuBar;
    @FXML public VBox vbox;
    
    private Checkerboard checkerboard;
    private Stage stage;
    private double menuHeight;
    
    public void resizeBoard(ActionEvent event){
        if (event.getSource() == sixteen){
            checkerboard = new Checkerboard(16,16,board.getWidth(),board.getHeight(), checkerboard.getLightColor(), checkerboard.getDarkColor());
        } else if (event.getSource() == ten){
            checkerboard = new Checkerboard(10,10,board.getWidth(),board.getHeight(), checkerboard.getLightColor(), checkerboard.getDarkColor());
        } else if (event.getSource() == eight){
            checkerboard = new Checkerboard(8,8,board.getWidth(),board.getHeight(), checkerboard.getLightColor(), checkerboard.getDarkColor());            
        } else {
            checkerboard = new Checkerboard(3,3,board.getWidth(),board.getHeight(), checkerboard.getLightColor(), checkerboard.getDarkColor());            
        }
        update();
    }
    
    public void changeBoardColor(ActionEvent event){
        if (event.getSource() == blueColor){
            checkerboard = new Checkerboard(checkerboard.getNumRows(),checkerboard.getNumCols(),board.getWidth(),board.getHeight(), Color.SKYBLUE, Color.DARKBLUE);            
        } else {
            checkerboard = new Checkerboard(checkerboard.getNumRows(),checkerboard.getNumCols(),board.getWidth(),board.getHeight(), Color.RED, Color.BLACK);            
        }
        update();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Initialize");
    }
    
    public void start(Stage stage){
        System.out.println("Start");
        this.stage = stage;
        stage.setTitle("DPDBP7 Checkerboard");
        menuHeight = menuBar.getHeight()*1.75;
        System.out.println("Menu Height: " + menuHeight);
        checkerboard = new Checkerboard(8, 8, board.getWidth(), board.getHeight());
        update();
        
        ChangeListener<Number> lambdaChangeListener = (ObservableValue<? extends Number> observable, Number oldValue, final Number newValue) -> {
            checkerboard = new Checkerboard(checkerboard.getNumRows(), checkerboard.getNumCols(), stage.getWidth(), stage.getHeight()-menuHeight, checkerboard.getLightColor(), checkerboard.getDarkColor());
            update();
        };
        this.stage.widthProperty().addListener(lambdaChangeListener);
        this.stage.heightProperty().addListener(lambdaChangeListener);
    }
    
    public void update(){
        vbox.getChildren().remove(board);
        board = checkerboard.build();
        vbox.getChildren().add(board);
    }
}
