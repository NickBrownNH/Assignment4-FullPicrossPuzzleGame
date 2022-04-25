package com.example.assignment4picrosspuzzlegame;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

/**
 * Controller between the GUI and rest of code
 * @author Dylan Gomez, edited by CPR
 */
public class PicrossController<localEntered> implements Initializable {

    @FXML
    private Label label_2, label_3, label_4, label_5, label_6, label_a, label_b, label_c, label_d, label_e, nameofFile;

    @FXML
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25;

    @FXML
    private GridPane grid;

    @FXML
    private ActionEvent getNewPuzzle;

    final String ON_COLOR = "-fx-background-color: black";
    final String OFF_COLOR = "-fx-background-color: white";
    private int[][] localEntered =
            {{0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0}};

    @FXML
    /**
     * Selects a puzzle and shows the solution, also prints the title
     */
    protected void showSolution() {
        /*
        //Set buttons on the gridpane to either black or white
        //depending on the puzzle's solution array
        setButton(b1, puzzle1.getValue(0, 0));
        setButton(b2, puzzle1.getValue(0, 1));
        setButton(b3, puzzle1.getValue(0, 2));
        setButton(b4, puzzle1.getValue(0, 3));
        setButton(b5, puzzle1.getValue(0, 4));
        setButton(b6, puzzle1.getValue(1, 0));
        setButton(b7, puzzle1.getValue(1, 1));
        setButton(b8, puzzle1.getValue(1, 2));
        setButton(b9, puzzle1.getValue(1, 3));
        setButton(b10, puzzle1.getValue(1, 4));
        setButton(b11, puzzle1.getValue(2, 0));
        setButton(b12, puzzle1.getValue(2, 1));
        setButton(b13, puzzle1.getValue(2, 2));
        setButton(b14, puzzle1.getValue(2, 3));
        setButton(b15, puzzle1.getValue(2, 4));
        setButton(b16, puzzle1.getValue(3, 0));
        setButton(b17, puzzle1.getValue(3, 1));
        setButton(b18, puzzle1.getValue(3, 2));
        setButton(b19, puzzle1.getValue(3, 3));
        setButton(b20, puzzle1.getValue(3, 4));
        setButton(b21, puzzle1.getValue(4, 0));
        setButton(b22, puzzle1.getValue(4, 1));
        setButton(b23, puzzle1.getValue(4, 2));
        setButton(b24, puzzle1.getValue(4, 3));
        setButton(b25, puzzle1.getValue(4, 4));

        CellEventHandler bEvent1 = new CellEventHandler(b1);
        CellEventHandler bEvent2 = new CellEventHandler(b2);
        CellEventHandler bEvent3 = new CellEventHandler(b3);
        CellEventHandler bEvent4 = new CellEventHandler(b4);
        CellEventHandler bEvent5 = new CellEventHandler(b5);
        CellEventHandler bEvent6 = new CellEventHandler(b6);
        CellEventHandler bEvent7 = new CellEventHandler(b7);
        CellEventHandler bEvent8 = new CellEventHandler(b8);
        CellEventHandler bEvent9 = new CellEventHandler(b9);
        CellEventHandler bEvent10 = new CellEventHandler(b10);
        CellEventHandler bEvent11 = new CellEventHandler(b11);
        CellEventHandler bEvent12 = new CellEventHandler(b12);
        CellEventHandler bEvent13 = new CellEventHandler(b13);
        CellEventHandler bEvent14 = new CellEventHandler(b14);
        CellEventHandler bEvent15 = new CellEventHandler(b15);
        CellEventHandler bEvent16 = new CellEventHandler(b16);
        CellEventHandler bEvent17 = new CellEventHandler(b17);
        CellEventHandler bEvent18 = new CellEventHandler(b18);
        CellEventHandler bEvent19 = new CellEventHandler(b19);
        CellEventHandler bEvent20 = new CellEventHandler(b20);
        CellEventHandler bEvent21 = new CellEventHandler(b21);
        CellEventHandler bEvent22 = new CellEventHandler(b22);
        CellEventHandler bEvent23 = new CellEventHandler(b23);
        CellEventHandler bEvent24 = new CellEventHandler(b24);
        CellEventHandler bEvent25 = new CellEventHandler(b25);


        puzzle1.toggleCell(bEvent1.inputtedRow, bEvent1.inputtedCol);
        puzzle1.toggleCell(bEvent2.inputtedRow, bEvent2.inputtedCol);
        puzzle1.toggleCell(bEvent3.inputtedRow, bEvent3.inputtedCol);
        puzzle1.toggleCell(bEvent4.inputtedRow, bEvent4.inputtedCol);
        puzzle1.toggleCell(bEvent5.inputtedRow, bEvent5.inputtedCol);
        puzzle1.toggleCell(bEvent6.inputtedRow, bEvent6.inputtedCol);
        puzzle1.toggleCell(bEvent7.inputtedRow, bEvent7.inputtedCol);
        puzzle1.toggleCell(bEvent8.inputtedRow, bEvent8.inputtedCol);
        puzzle1.toggleCell(bEvent9.inputtedRow, bEvent9.inputtedCol);
        puzzle1.toggleCell(bEvent10.inputtedRow, bEvent10.inputtedCol);
        puzzle1.toggleCell(bEvent11.inputtedRow, bEvent11.inputtedCol);
        puzzle1.toggleCell(bEvent12.inputtedRow, bEvent12.inputtedCol);
        puzzle1.toggleCell(bEvent13.inputtedRow, bEvent13.inputtedCol);
        puzzle1.toggleCell(bEvent14.inputtedRow, bEvent14.inputtedCol);
        puzzle1.toggleCell(bEvent15.inputtedRow, bEvent15.inputtedCol);
        puzzle1.toggleCell(bEvent16.inputtedRow, bEvent16.inputtedCol);
        puzzle1.toggleCell(bEvent17.inputtedRow, bEvent17.inputtedCol);
        puzzle1.toggleCell(bEvent18.inputtedRow, bEvent18.inputtedCol);
        puzzle1.toggleCell(bEvent19.inputtedRow, bEvent19.inputtedCol);
        puzzle1.toggleCell(bEvent20.inputtedRow, bEvent20.inputtedCol);
        puzzle1.toggleCell(bEvent21.inputtedRow, bEvent21.inputtedCol);
        puzzle1.toggleCell(bEvent22.inputtedRow, bEvent22.inputtedCol);
        puzzle1.toggleCell(bEvent23.inputtedRow, bEvent23.inputtedCol);
        puzzle1.toggleCell(bEvent24.inputtedRow, bEvent24.inputtedCol);
        puzzle1.toggleCell(bEvent25.inputtedRow, bEvent25.inputtedCol);

*/

    }

    /**
     * Quits/stops the program
     */
    public void quit() {
        System.exit(0);
    }

    /**
     * Changes the background color of a button (i.e., pixel on the puzzle)
     *
     * @param b     the button to change
     * @param value 0 == OFF, 1 == ON
     */
    public void setButton(Button b, int value) {
        b.setStyle(value == 0 ? OFF_COLOR : ON_COLOR);
    }

    public void getNewPuzzle() {
        //creates objects
        PicrossPuzzlePool pool1 = new PicrossPuzzlePool(Paths.get(".\\Data"));
        PicrossPuzzle puzzle1 = pool1.getRandomPuzzle();
        //prints file name in gui
        String currentfile = pool1.getFile();
        nameofFile.setText(currentfile.substring(0, currentfile.length() - 4));

        puzzle1.zeroEntered();
        String[] rowClues = puzzle1.getRowClues();
        String[] colClues = puzzle1.getColumnClues();
        System.out.println();
        System.out.println(puzzle1);

        //Prints the puzzle's solution to standard output for debugging purposes
        System.out.println("ROW CLUES: ");
        for (int i = 0; i < rowClues.length; i++)
            System.out.print("\"" + rowClues[i] + "\" ");
        System.out.println("\nCOLUMN CLUES: ");
        for (int i = 0; i < colClues.length; i++)
            System.out.print("\"" + colClues[i] + "\" ");
        System.out.println();

        //Place column clues on GUI
        label_a.setText(colClues[0] + " ");
        label_b.setText(colClues[1] + " ");
        label_c.setText(colClues[2] + " ");
        label_d.setText(colClues[3] + " ");
        label_e.setText(colClues[4] + " ");

        //Place row clues on GUI
        label_2.setText(rowClues[0] + " ");
        label_3.setText(rowClues[1] + " ");
        label_4.setText(rowClues[2] + " ");
        label_5.setText(rowClues[3] + " ");
        label_6.setText(rowClues[4] + " ");

        puzzle1.zeroEntered();
        Button b;
        EventHandler<ActionEvent> event;

        System.out.println(grid.getChildren().size());

        //gridpane is 7x6, row1 and col1 hold labels, so start at index 1 (skip labels)
        for (int col = 1; col < 6; col++)
            for (int row = 1; row < 6; row++) {
                int i = col * 6 + row;
                System.out.println(grid.getChildren().get(i));
                b = (Button) (grid.getChildren().get(i));

                //blank out each button's text field
                b.setText("");

                //instantiate the action event
                event = new CellEventHandler(b,puzzle1);

                //associate event with the button being clicked
                b.setOnAction(event);
            }




    }



    @Override
    /**
     * Acts as the start point for the Controller and shows a puzzle's solution
     */
    public void initialize(URL url, ResourceBundle rb) {
        getNewPuzzle();
/*

        Button b;
        EventHandler<ActionEvent> event;

        System.out.println(grid.getChildren().size());

        //gridpane is 7x6, row1 and col1 hold labels, so start at index 1 (skip labels)
        for (int col = 1; col < 6; col++)
            for (int row = 1; row < 6; row++) {
                int i = col * 6 + row;
                System.out.println(grid.getChildren().get(i));
                b = (Button) (grid.getChildren().get(i));

                //blank out each button's text field
                b.setText("");

                //instantiate the action event
                event = new CellEventHandler(b);

                //associate event with the button being clicked
                b.setOnAction(event);
            }
*/


    }

    /**
     * Event handler for each button on the grid pane
     */
    private class CellEventHandler implements EventHandler<ActionEvent> {
        private final Button b;
        public int inputtedRow;
        public int inputtedCol;
        PicrossPuzzle pp;

        /**
         * Constructs an object and associates the button to the event handler
         *
         * @param b
         */
        public CellEventHandler(Button b,PicrossPuzzle pp) {
            this.b = b;
            this.pp = pp;
        }


        /**
         * Identifies which row and column of the clicked button
         *
         * @param event
         */
        public void handle(ActionEvent event) {
            //find out which row ad col this button is at the gridpane
            int row = (grid.getRowIndex(b) == null) ? 0 : grid.getRowIndex(b);
            int col = (grid.getColumnIndex(b) == null) ? 0 : grid.getColumnIndex(b);

            System.out.println("You clicked row " + row + " col " + col);
            pp.toggleCell(row,col);
            if (pp.puzzleSolved()) {
                System.out.println("Puzzle SOLVED!!!");
            } else {
                System.out.println("Puzzle not solved");
            }

        }


        public int getRowEntered() {
            return inputtedRow;
        }

        public int getColEntered() {
            return inputtedCol;
        }

    }
}