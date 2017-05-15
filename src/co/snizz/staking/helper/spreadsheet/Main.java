package co.snizz.staking.helper.spreadsheet;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Snizz on 5/15/2017.
 */
public class Main extends Application
{
    private Stage spreadsheetStage;
    private AnchorPane ssLayout;

    @Override
    public void start(Stage spreadsheetStage)
    {
        this.spreadsheetStage = spreadsheetStage;
        this.spreadsheetStage.setTitle("Staking Helper: Spreadsheet");

        ssLayout();

    }

    public void ssLayout()
    {
        try
        {
            FXMLLoader ssLoader = new FXMLLoader();
            ssLoader.setLocation(co.snizz.staking.helper.spreadsheet.Main.class.getResource("Spreadsheet.fxml"));
            ssLayout = ssLoader.load();

            Scene ssScene = new Scene(ssLayout);

            Spreadsheet controller = ssLoader.getController();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }



}
