import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LogCalc extends Application {
	
	Label valuelabel;
	Button butt0,butt1,butt2,butt3,butt4,butt5,butt6,butt7,butt8,butt9,buttadd,buttsub,buttmult,buttdiv,buttclear;
	double num=0;
	char op = '\0';
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void operating(double num2) {
		switch(op) {
		case '\0': 
			num = num2;
			break;
		case '+':
			num = num + num2;
			break;
		case '-':
			num = num - num2;
			break;
		case '*':
			num = num * num2;
			break;
		case '/':
			num = num / num2;
			break;
		}
		op='\0';
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Basic Calculator");
		valuelabel = new Label("Value: "+num);
		VBox root = new VBox();
		HBox valline = new HBox();
		HBox lineone = new HBox();
		HBox linetwo = new HBox();
		HBox linethree = new HBox();
		HBox linefour = new HBox();
		
		Scene scene = new Scene(root, 90, 120);
		stage.setScene(scene);
		
		butt0 = new Button("0");
		butt0.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				operating(0.0);
				valuelabel.setText("Value: "+num);
			}
		});
		
		butt1 = new Button("1");
		butt1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				operating(1.0);
				valuelabel.setText("Value: "+num);
			}
		});
		butt2 = new Button("2");
		butt2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				operating(2.0);
				valuelabel.setText("Value: "+num);
			}
		});
		butt3 = new Button("3");
		butt3.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				operating(3.0);
				valuelabel.setText("Value: "+num);
			}
		});
		butt4 = new Button("4");
		butt4.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				operating(4.0);
				valuelabel.setText("Value: "+num);
			}
		});
		butt5 = new Button("5");
		butt5.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				operating(5.0);
				valuelabel.setText("Value: "+num);
			}
		});
		butt6 = new Button("6");
		butt6.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				operating(6.0);
				valuelabel.setText("Value: "+num);
			}
		});
		butt7 = new Button("7");
		butt7.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				operating(7.0);
				valuelabel.setText("Value: "+num);
			}
		});
		butt8 = new Button("8");
		butt8.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				operating(8.0);
				valuelabel.setText("Value: "+num);
			}
		});
		butt9 = new Button("9");
		butt9.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				operating(9.0);
				valuelabel.setText("Value: "+num);
			}
		});
		
		buttadd = new Button("+");
		buttadd.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {				
				op='+';
			}
		});
		buttsub = new Button("-");
		buttsub.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {				
				op='-';
			}
		});
		buttmult = new Button("*");
		buttmult.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {				
				op='*';
			}
		});
		buttdiv = new Button("/");
		buttdiv.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {				
				op='/';
			}
		});
		buttclear = new Button("Clear");
		buttclear.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				num=0.0;
				op='\0';
				valuelabel.setText("Value: "+num);
			}
		});
		valline.getChildren().add(valuelabel);
		lineone.getChildren().addAll(buttadd,butt1,butt2,butt3);
		linetwo.getChildren().addAll(buttsub,butt4,butt5,butt6);
		linethree.getChildren().addAll(buttmult,butt7,butt8,butt9);
		linefour.getChildren().addAll(buttdiv,butt0,buttclear);
		root.getChildren().addAll(valuelabel,lineone,linetwo,linethree,linefour);
		
		stage.show();
	}
}
