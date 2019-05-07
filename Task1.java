package TestSWT;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;


public class Task1 {
	
        Task1(Shell shell){
	    Group group1 = new Group(shell,SWT.SHADOW_NONE);
	    group1.setText("task1");
	    group1.setLayoutData(new RowData(100,100));
	    RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
	    rowLayout.pack=false;
	    group1.setLayout(rowLayout);
	   
	    StyledText text = new StyledText(group1,SWT.WRAP);
	    CCombo combo = new CCombo(group1,SWT.SIMPLE);
	    Button button = new Button(group1,SWT.PUSH);
	    button.setText("Push");
	    hashSet hash = new hashSet();
	    

	   button.addSelectionListener(new SelectionAdapter() {
	        @Override
			public void widgetSelected(SelectionEvent e) {
	        	
	        
	        	if (hash.isEquals(text.getText())) {   
	        		MessageBox mistake = new MessageBox(shell);      
	        		mistake.setMessage("Cannot enter this number, it is already exists");
	        		mistake.open();     
	                   } 
	        	else {
	        		
	                   combo.add(text.getText());
	                   combo.setText(text.getText());
	                   hash.add(text.getText());
	                   text.setText("");
	           
	                   }
	               } 
	            
	            	
	        
	    });
	}
}
