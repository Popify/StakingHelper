package co.snizz.staking.helper.overview;

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
    private Stage ovStage;
    private AnchorPane ovLayout;

    @Override
    public void start(Stage ovStage)
    {
        this.ovStage = ovStage;
        this.ovStage.setTitle("Staking Helper");

        initLayout();
    }

    public void initLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(co.snizz.staking.helper.overview.Main.class.getResource("Overview.fxml"));
            ovLayout = loader.load();

            Scene ovScene = new Scene(ovLayout);

            ovStage.setScene(ovScene);
            ovStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        launch(args);
    }

}
