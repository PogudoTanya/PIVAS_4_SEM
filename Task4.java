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


public class Task4 {

	Task4(Shell shell){

	Group group1 = new Group(shell,SWT. SHADOW_NONE);
	group1.setText("task4");
	group1.setLayoutData(new RowData(200,200));
	RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
	rowLayout.pack=false;
	group1.setLayout(rowLayout);



	StyledText text = new StyledText(group1,SWT.CHECK);
	Button []buttons = new Button[3];
	Button buttonPress = new Button(group1,SWT.PUSH);
	buttonPress.setText("Choose you favourite color");
	for(int button =0; button<buttons.length; button++)
	    buttons[button] = new Button(group1,SWT.CHECK);

	buttons[0].setText("Blue");
	buttons[1].setText("Red");
	buttons[2].setText("Green");

	

	buttonPress.addSelectionListener(new SelectionAdapter() {
	    @Override
		public void widgetSelected(SelectionEvent e) {
	    	if (!text.getText().isEmpty()) {
	    		    	for(int i=0; i<3; i++){
	    
	    		 
	        if (text.getText().equals(buttons[i].getText())) {
                     
                     buttons[i].setSelection(!buttons[i].getSelection());
	    	 }
                     
	    	 }
	    		    
	    		    	}
	    		    	
                 
	    }
				
	    	   
	    	    
	    	

	  
	    
	


	});
	

}	
}

