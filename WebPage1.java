import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.transform.Scale;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextBuilder;

public class WebPage1 extends Application {
	
Stage window;
Scene sceneSCH,sceneWRK,sceneFAM,sceneTRV,sceneHOME;
public static void main(String[] args) {
	launch(args);
	}

@Override
public void start(Stage stage) throws Exception {
	window = stage;
	
	
	

	//pane.setBottom(getHBox1());
	
	//Scene scene = new Scene(pane);
	
	//stage.setScene(scene);
	
	//home screen
	Button btHome = new Button ("Home");
	btHome.setOnAction(e -> window.setScene(sceneHOME));
	
	Button btWork = new Button("work");
	btWork.setOnAction(e -> window.setScene(sceneWRK));
	
	Button btSch = new Button ("School");
	btSch.setOnAction(e -> window.setScene(sceneSCH));
	
	Button btTrv = new Button("Travel");
	btTrv.setOnAction(e -> window.setScene(sceneTRV));
	
	Button btFam = new Button("Family");
	btFam.setOnAction(e -> window.setScene(sceneFAM));
	
	
	
	//LAYOUT 0
	
	//Layout 0 - TOP
	HBox Layout0= new HBox(40);
	Layout0.setStyle("-fx-background-color: green");
	Layout0.setAlignment(Pos.CENTER);
	Layout0.setPadding(new Insets(50, 50, 50, 50));
	Label L0 = new Label("Welcome To the Home page ");
	Layout0.getChildren().addAll(L0,btSch);
	
	
	VBox mid0 = new VBox(40);
	mid0.setAlignment(Pos.CENTER);
	ImageView bg1 = new ImageView("https://media.licdn.com/mpr/mpr/shrinknp_200_200/p/3/005/0b5/32d/03a0c8e.jpg");
	Text LBL0 = TextBuilder.create().text("This web application will take a look \n at a Small personal site (WIP)").build();
	LBL0.setFont(Font.font("verdana",18));
	mid0.getChildren().addAll(bg1,LBL0);
	
	//LAYOUT 0 BOTTOM
	VBox Blayout0 = new VBox(20);
	Label B0 = new Label("Made By Nyenty Ayuk-Enow");
	Blayout0.setStyle("-fx-background-color: grey");
	Blayout0.getChildren().add(B0);
	
	BorderPane pane = new BorderPane();
	pane.setTop(Layout0);
	pane.setCenter(mid0);
	pane.setBottom(Blayout0);
	sceneHOME = new Scene(pane, 500, 500);
	
	//LAYOUT 1
	
	//Layout 1 top
	HBox Layout1 = new HBox(40);
	Layout1.setStyle("-fx-background-color: gold");
	Layout1.setAlignment(Pos.CENTER);
	Layout1.setPadding(new Insets(50, 50, 50, 50));
	Label L1 = new Label("This page Shows my College experience");
	Layout1.getChildren().addAll(L1,btWork);
	sceneSCH= new Scene(Layout1, 500,500);
	
	VBox mid1 = new VBox(20);
	mid1.setAlignment(Pos.TOP_CENTER);
	Text LBL1 = TextBuilder.create().text("- Campbell High School (2013) \n - Southern PolyTechnic State University (2013-15) \n- Kennesaw State University(2015- )  ").build();
	LBL0.setFont(Font.font("verdana",18));
	ImageView KSU1 = new ImageView ("http://picresize.com/images/rsz_5rsz_consolidation-graphic.jpg");
	mid1.getChildren().addAll(LBL1);
	mid1.getChildren().add(KSU1);
	
	// layout 1 bottom
	VBox bOut1 = new VBox(20);
	Label B1 = new Label("Made By Nyenty Ayuk-Enow");
	bOut1.setStyle("-fx-background-color: grey");
	bOut1.getChildren().add(B1);
	
	BorderPane bPane1 = new BorderPane();
	bPane1.setTop(Layout1);
	bPane1.setCenter(mid1);
	bPane1.setBottom(bOut1);
	sceneSCH= new Scene(bPane1, 500,500);
	
	//LAYOUT 2
	
	//-layout 2 top 
	HBox layout2= new HBox(40);
	layout2.setStyle("-fx-background-color: green");
	layout2.setAlignment(Pos.CENTER);
	Label L2 = new Label("This page will shows my work experience");
	layout2.getChildren().addAll(L2, btTrv);
	layout2.setPadding(new Insets(50, 50, 50, 50));
	
	//Layout 2 mid
		HBox mid2 = new HBox(20);
		ImageView WorkPic = new ImageView("https://i.imgur.com/Y40gI1d.png");
		mid2.getChildren().addAll(WorkPic);
	
	//Layout 2 Bottom
	VBox bOut2 = new VBox(20);
	Label B2 = new Label("Made By Nyenty Ayuk-Enow");
	bOut2.setStyle("-fx-background-color: grey");
	bOut2.getChildren().add(B2);
	
	
	
	
	BorderPane bPane2 = new BorderPane();
	bPane2.setTop(layout2);
	bPane2.setCenter(mid2);
	bPane2.setBottom(bOut2);
	sceneWRK = new Scene(bPane2, 800,800);
	
	//LAYOUT 3
	
	//layout 3 top border
	HBox Layout3 = new HBox(40);
	Layout3.setStyle("-fx-background-color: gold");
	Layout3.setAlignment(Pos.CENTER);
	Label L3 = new Label("This page will show you pictures of places that I have been");
	Layout3.setPadding(new Insets(50, 50, 50, 50));
	Layout3.getChildren().addAll(L3,btFam);
	//- layout 3 middle border
	VBox iMagebox = new VBox(20);
	ImageView CR = new ImageView("http://www.ultimateflags.com/images/P/buy_costarica_flag-01-01.gif");
	ImageView FR = new ImageView("https://image.spreadshirtmedia.com/image-server/v1/mp/compositions/P1004749224MPC1008073866/views/1,width=300,height=300,appearanceId=2,backgroundColor=E8E8E8,version=1485256808/france-france-map-flag-map-france-t-shirts-men-s-t-shirt.jpg");
	ImageView CN = new ImageView("http://www.worldatlas.com/r/w300-h175-c300x175/upload/b2/a6/e5/shutterstock-634648484-1.jpg");
	Label CRLBL = new Label("Costa Rica");
	Label FRLBL = new Label ("France");
	Label CNLBL = new Label("Cameroon");
	iMagebox.getChildren().addAll(CR,CRLBL);
	iMagebox.getChildren().addAll(FR, FRLBL);
	iMagebox.getChildren().addAll(CN, CNLBL);
	//-layout 3 bottom border
	VBox bOut3 = new VBox(20);
	Label B3 = new Label("Made By Nyenty Ayuk-Enow");
	bOut3.setStyle("-fx-background-color: grey");
	bOut3.getChildren().add(B3);
	
	BorderPane bPane3 = new BorderPane();
	bPane3.setTop(Layout3);
	bPane3.setCenter(iMagebox);
	bPane3.setBottom(bOut3);
	sceneTRV = new Scene(bPane3, 1000, 1000);
	
	//LAYOUT 4
	
	//layout4 TOP
	HBox Layout4 = new HBox(40);
	Layout4.setStyle("-fx-background-color: green");
	Layout4.setAlignment(Pos.CENTER);
	Label L4 = new Label("This page will show you pictures of my family");
	Layout4.setPadding(new Insets(50, 50, 50, 50));
	Layout4.getChildren().addAll(L4, btHome);
	//layout 4 middle
	VBox iMagebox2 = new VBox(20);
	ImageView ProfilePic = new ImageView("https://scontent-atl3-1.xx.fbcdn.net/v/t1.0-1/p160x160/18835940_1493397350731838_869127336469202437_n.jpg?oh=3502a1828cb7fb1649fcc65662cb0b6f&oe=5A672927");
	Label FAM1 = new Label("Picture of My Sister, Mother, and I in costa rica");
	iMagebox2.getChildren().addAll(ProfilePic, FAM1);
	ImageView ProfilePic2 = new ImageView("https://scontent-atl3-1.xx.fbcdn.net/v/t1.0-1/p160x160/22729066_1665814296823475_4331264617660504001_n.jpg?oh=5deb37a9f1c80c8a8101ba48cca7a87c&oe=5A80D985");
	Label FAM2 = new Label("Picture of my Uncle, and Multiple Cousins as well as my sister & I");
	iMagebox2.getChildren().addAll(ProfilePic2,FAM2);
	//layout 4 bottom
	VBox bOut4 = new VBox(20);
	Label B4 = new Label("Made By Nyenty Ayuk-Enow");
	bOut4.setStyle("-fx-background-color: grey");
	bOut4.getChildren().add(B4);
	
	BorderPane bPane4 = new BorderPane();
	bPane4.setTop(Layout4);
	bPane4.setCenter(iMagebox2);
	bPane4.setBottom(bOut4);
	sceneFAM = new Scene(bPane4, 700,700);
	

	
	window.setScene(sceneHOME);
	window.setTitle("Nyenty WebPage");
	window.show();
}
	
	


	
	
	 
	

	
	
	
	


	

}
