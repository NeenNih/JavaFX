package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	
	public static void main(String[] args) {
		
		launch(args);
		
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Group root = new Group();
		Scene scene = new Scene(root,600,600,Color.CYAN);
		Stage stage = new Stage();
		  
		Text text = new Text();
		text.setText("HaHaHa...");
		text.setX(50);
		text.setY(75);
		text.setFont(Font.font("Gabriola",100));
		text.setFill(Color.INDIGO);
		  
		Line line = new Line();
		line.setStartX(100);
		line.setStartY(300);
		line.setEndX(500);
		line.setEndY(200);
		line.setStrokeWidth(5);
		line.setStroke(Color.YELLOW);
		line.setOpacity(0.7);
		line.setRotate(60);
		  
		Rectangle rectangle = new Rectangle();
		rectangle.setX(60);
		rectangle.setY(180);
		rectangle.setWidth(100);
		rectangle.setHeight(100);
		rectangle.setFill(Color.LIGHTPINK);
		rectangle.setStrokeWidth(6);
		rectangle.setStroke(Color.DEEPPINK);
		  
		Polygon triangle = new Polygon();
		triangle.getPoints().setAll(	
				200.0,200.0,
				300.0,300.0,
				200.0,300.0		
		);
		triangle.setFill(Color.BLUEVIOLET);
		  
		Circle circle = new Circle();
		circle.setCenterX(400);
		circle.setCenterY(350);
		circle.setRadius(50);
		circle.setFill(Color.CRIMSON);
		  
		Image image = new Image("Bee.png");
		ImageView imageView = new ImageView(image);
		imageView.setX(100);
		imageView.setY(440);
		   
		root.getChildren().add(text);
		root.getChildren().add(line);
		root.getChildren().add(rectangle);
		root.getChildren().add(triangle);
		root.getChildren().add(circle);
		root.getChildren().add(imageView);
		
		stage.setScene(scene);
		stage.show();
		
	}

}
