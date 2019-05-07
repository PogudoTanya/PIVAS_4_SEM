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
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class Task5{
	private String var;
	  Task5 (Shell shell){

	      Group group = new Group(shell,SWT.SHADOW_NONE);
	      group.setText("task5");
	      group.setLayoutData(new RowData(600,200));
	      RowLayout rowLayout = new RowLayout(SWT.HORIZONTAL);
	      rowLayout.pack=false;
	      group.setLayout(rowLayout);
	        
	    
	      StyledText text = new StyledText(group,SWT.CHECK);
	      Button button = new Button(group,SWT.PUSH);
	      button.setText("Кнопка 1");
	      Button button1 = new Button(group,SWT.PUSH);
	      button1.setText("Кнопка 2");
	      Button button2 = new Button(group,SWT.PUSH);
	      button2.setText("Кнопка 3");
        
	      Table table = new Table(group,SWT.MULTI);
	      TableColumn tableColumn1 = new TableColumn(table,SWT.LEFT);
	      TableColumn tableColumn2 = new TableColumn(table,SWT.LEFT);
	      tableColumn1.setWidth(50);
	      tableColumn2.setWidth(50);
	      TableItem tableItem1 = new TableItem(table,SWT.CHECK);
	      //TableItem tableItem2= new TableItem(table,SWT.CHECK);
	        
	        
	      button.addSelectionListener(new SelectionAdapter() {
	          @Override
			public void widgetSelected(SelectionEvent e) {
	            	
	            	if (text.getText().isEmpty()) {
	            		 MessageBox warning = new MessageBox(shell);
	        	         warning.setMessage("Input TEXT");
	        	         warning.open(); 
	            		
	            	}

	              if (!text.getText().isEmpty()) {
	                    tableItem1.setText(text.getText());                 
	                    text.setText("");
	                    
	                } 
	            		            	
	            }
	        });

	        button1.addSelectionListener(new SelectionAdapter() {
	      
	            @Override
				public void widgetSelected(SelectionEvent e) {
	                if (!tableItem1.getText(0).isEmpty()){
	                	var=tableItem1.getText(0);
	                    
	                	tableItem1.setText(1,tableItem1.getText());
	                	tableItem1.setText(0,"");
		                
	                } 
	                
	            }
	        });

	        button2.addSelectionListener(new SelectionAdapter() {
	      
	            @Override
				public void widgetSelected(SelectionEvent e) {
	            	       	 if (!tableItem1.getText(1).isEmpty()){
		                	tableItem1.setText(0,var);
		                	tableItem1.setText(1,"");
			                
		                } 
	            }
	        });
	        table.clearAll();
	    }

}
