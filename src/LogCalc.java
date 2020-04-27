import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.lang.Math;

public class LogCalc extends Application {
	
	Label valuelabel;
	Button butt0,butt1,butt2,butt3,butt4,butt5,butt6,butt7,butt8,butt9,buttadd,buttsub,buttmult,buttdiv,buttclear,buttlog2,buttenter;
	double screen_num = 0.0;
	double num1=0.0;
	double num2=0.0;
	char op = '\0';
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void operating() {
		switch(op) {
		case '+':
			num1 = num1 + num2;
			break;
		case '-':
			num1 = num1 - num2;
			break;
		case '*':
			num1 = num1 * num2;
			break;
		case '/':
			num1 = num1 / num2;
			break;
		}
		op='\0';
		num2 = 0.0;
		screen_num = 0.0;
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Basic Calculator");
		valuelabel = new Label("Value: "+screen_num);
		VBox root = new VBox();
		HBox valline = new HBox();
		HBox lineone = new HBox();
		HBox linetwo = new HBox();
		HBox linethree = new HBox();
		HBox linefour = new HBox();
		HBox linefive = new HBox();
		
		Scene scene = new Scene(root, 82, 145);
		stage.setScene(scene);
		
		butt0 = new Button("0");
		butt0.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if ((op == '/')) {
					valuelabel.setText("ERROR: bad input");
					return;
				}
				//operating(0.0);
				screen_num = screen_num * 10.0;
				valuelabel.setText("Value: "+screen_num);
			}
		});
		
		butt1 = new Button("1");
		butt1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				//operating(1.0);
				screen_num = screen_num*10.0 + 1.0;
				valuelabel.setText("Value: "+screen_num);
			}
		});
		butt2 = new Button("2");
		butt2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				//operating(2.0);
				screen_num = screen_num*10.0 + 2.0;
				valuelabel.setText("Value: "+screen_num);
			}
		});
		butt3 = new Button("3");
		butt3.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				screen_num = screen_num*10.0 + 3.0;
				valuelabel.setText("Value: "+screen_num);
			}
		});
		butt4 = new Button("4");
		butt4.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				screen_num = screen_num*10.0 + 4.0;
				valuelabel.setText("Value: "+screen_num);
			}
		});
		butt5 = new Button("5");
		butt5.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				screen_num = screen_num*10.0 + 5.0;
				valuelabel.setText("Value: "+screen_num);
			}
		});
		butt6 = new Button("6");
		butt6.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				screen_num = screen_num*10.0 + 6.0;
				valuelabel.setText("Value: "+screen_num);
			}
		});
		butt7 = new Button("7");
		butt7.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				screen_num = screen_num*10.0 + 7.0;
				valuelabel.setText("Value: "+screen_num);
			}
		});
		butt8 = new Button("8");
		butt8.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				screen_num = screen_num*10.0 + 8.0;
				valuelabel.setText("Value: "+screen_num);
			}
		});
		butt9 = new Button("9");
		butt9.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				screen_num = screen_num*10.0 + 9.0;
				valuelabel.setText("Value: "+screen_num);
			}
		});
		
		buttadd = new Button("+");
		buttadd.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {				
				op='+';
				num1 = screen_num;
				screen_num = 0.0;
			}
		});
		buttsub = new Button("-");
		buttsub.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {				
				op='-';
				num1 = screen_num;
				screen_num = 0.0;
			}
		});
		buttmult = new Button("*");
		buttmult.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {				
				op='*';
				num1 = screen_num;
				screen_num = 0.0;
			}
		});
		buttdiv = new Button("/");
		buttdiv.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {				
				op='/';
				num1 = screen_num;
				screen_num = 0.0;
			}
		});
		buttlog2 = new Button("log2");
		buttlog2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				num1 = screen_num;
				if ((op != '\0') || (num1 <= 0)) {
					num1 = 0.0;
					num2 = 0.0;
					screen_num = 0.0;
					op = '\0';
					valuelabel.setText("ERROR: bad input");
				}
				else {
					num1 = Math.log(screen_num) / Math.log(2.0);
					screen_num = num1;
					valuelabel.setText("Value: "+screen_num);
				}
			}
		});
		buttclear = new Button("Clear");
		buttclear.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				num1=0.0;
				num2=0.0;
				screen_num = 0.0;
				op='\0';
				valuelabel.setText("Value: 0.0");
			}
		});
		buttenter = new Button("Enter");
		buttenter.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				num2 = screen_num;
				operating();
				screen_num = num1;
				valuelabel.setText("Value: "+screen_num);
			}
		});
		valline.getChildren().add(valuelabel);
		lineone.getChildren().addAll(buttadd,butt1,butt2,butt3);
		linetwo.getChildren().addAll(buttsub,butt4,butt5,butt6);
		linethree.getChildren().addAll(buttmult,butt7,butt8,butt9);
		linefour.getChildren().addAll(buttdiv,butt0,buttenter);
		linefive.getChildren().addAll(buttlog2,buttclear);
		root.getChildren().addAll(valuelabel,lineone,linetwo,linethree,linefour,linefive);
		
		stage.show();
	}
}
