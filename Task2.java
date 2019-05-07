package TestSWT;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;


public class Task2 {
	public String temp_var;
	
	    Task2(Shell shell){
	    Group group1 = new Group(shell,SWT.SHADOW_NONE);
	    group1.setText("task2");
	    group1.setLayoutData(new RowData(100,100));
        
	    RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
	    rowLayout.pack=false;
	    group1.setLayout(rowLayout);


	    StyledText text = new StyledText(group1,SWT.WRAP);
	    Button button1 = new Button(group1,SWT.PUSH);
	    button1.setText("Button 1");
	    Button button2 = new Button(group1,SWT.PUSH);
	    button2.setText("Button 2");

	    button1.addSelectionListener(new SelectionAdapter() {    
	        @Override
			public void widgetSelected(SelectionEvent e) {
	            if (!text.getText().isEmpty()){
	                button2.setText(text.getText());
	                text.setText("");
	            } 
	        }
	    });

	    button2.addSelectionListener(new SelectionAdapter() {   
	        @Override
			public void widgetSelected(SelectionEvent e) {
	            if (!button2.getText().isEmpty()){
	            	temp_var = button1.getText();
	            	button1.setText(button2.getText());
	            	button2.setText(temp_var);


	            }
	        }
	    });

	}




}



