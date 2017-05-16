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
    private Stage ssStage;
    private AnchorPane ssLayout;

    @Override
    public void start(Stage ssStage)
    {
        this.ssStage = ssStage;
        this.ssStage.setTitle("Staking Helper: Spreadsheet");

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

            ssStage.setScene(ssScene);
            ssStage.show();

            Spreadsheet ssController = ssLoader.getController();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }



}
