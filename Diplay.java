
package TestSWT;


import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Diplay {
	Display display = new Display();
    Shell shell = new Shell(display);
    
    Diplay(){
    
    	RowLayout rowLayout = new RowLayout(); 
    	rowLayout.type = SWT.HORIZONTAL; 
    	shell.setLayout(rowLayout);
    	shell.setSize(1200,800);
    	shell.setText("My first task");
    	
    		Task1 one = new Task1(shell);
    		Task2 two = new Task2(shell);
    		Task3 three = new Task3(shell);
    		Task4 four = new Task4(shell);
    		Task5 five = new Task5(shell);
    		DopTasks six = new DopTasks(shell);
    		
    	    shell.open();
    	      while (!shell.isDisposed()) {
    	          if (!display.readAndDispatch()) {
    	              display.sleep();
    	          }
    	      }
    	      display.dispose();
    	  }
   
    }
   
