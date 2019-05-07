package TestSWT;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;


public class Task3 {

	Task3(Shell shell){
	    Group group1 = new Group(shell,SWT. SHADOW_NONE);
	    group1.setText("task3");
	    group1.setLayoutData(new RowData(200,200));
	    RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
	    rowLayout.pack=false;
	    group1.setLayout(rowLayout);
        StyledText text = new StyledText(group1, SWT.CHECK);
	    Button []buttons = new Button[3];
	    Button push = new Button(group1,SWT.PUSH);
	    
	    push.setText("You are a ");
	    for(int i =0; i<3;i++)
    	{
    	buttons[i] = new Button(group1,SWT.RADIO);    	
    	}
	    buttons[0].setText("student");
	    buttons[1].setText("magistrant");
	    buttons[2].setText("aspirant");  
	    
	    push.addSelectionListener(new SelectionAdapter() {
	   
		public void widgetSelected(SelectionEvent e) {
	    	 if (text.getText().equals(buttons[0].getText())) {
                 buttons[0].setSelection(true);
                 buttons[1].setSelection(false);
                 buttons[2].setSelection(false);
             } else if (text.getText().equals(buttons[1].getText())) {
                 buttons[0].setSelection(false);
                 buttons[1].setSelection(true);
                 buttons[2].setSelection(false);
             }   
             else if (text.getText().equals(buttons[2].getText())){
                 buttons[0].setSelection(false);
                 buttons[1].setSelection(false);
                 buttons[2].setSelection(true);
             }	 
             else {
            	 MessageBox warning = new MessageBox(shell);
	         warning.setMessage("Input correct text");
	         warning.open(); 
             }
	    }
	});
	}	
	}
