package TestSWT;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class DopTasks  {

	public ArrayList<Button> box = new ArrayList<Button>();
	
	
	DopTasks(Shell shell) {
		Group group1 = new Group(shell, SWT.SHADOW_IN);
		group1.setText("Dop");
		group1.setLayoutData(new RowData(1000, 1000));
		FillLayout fillLayout = new FillLayout(); 
		fillLayout.type = SWT.VERTICAL; 
		RowLayout rowLayout = new RowLayout(SWT.HORIZONTAL);
		rowLayout.pack = true;
		rowLayout.justify = true;
		rowLayout.wrap = true;
		group1.setLayout(rowLayout);
		Button buttonPress = new Button(group1, SWT.PUSH);
		RunCheckboxes mass_run = new RunCheckboxes();
		Button StartButton = new Button(group1, SWT.PUSH);
		StartButton.setEnabled(true);
		StartButton.setText("Start");
		Button StopButton = new Button(group1, SWT.PUSH);
		StopButton.setEnabled(true);
		StopButton.setText("Stop");
		buttonPress.setText("Generate");
		Text text = new Text(group1, SWT.CHECK);

		
		buttonPress.addSelectionListener(new SelectionAdapter() {
		  public void widgetSelected(SelectionEvent e) {
			  
          if (!text.getText().isEmpty()) {
		  int my_number = Integer.parseInt(text.getText());
		  for(int i = 0; i < box.size(); i++)  
		  {
			  box.get(i).dispose();
		  }
           box.removeAll(box);
		   for(int i=0; i<my_number;i++)
		   {
		   Button set = new Button(group1,SWT.CHECK);
		   box.add(set); 
		   }
		   group1.layout();
		   text.setText("");
		   mass_run.step=0;
		   
		}
		}
		});

		
		StartButton.addSelectionListener(new SelectionAdapter() {
        public void widgetSelected(SelectionEvent arg0) {
        	
            mass_run.states(true);
            StartButton.setSelection(true);
            Thread thread = new Thread(mass_run);
            thread.start();
        }
    });
    
		StopButton.addSelectionListener(new SelectionAdapter() {
        public void widgetSelected(SelectionEvent arg0) {
            mass_run.states(false);
            StartButton.setSelection(true);
        }
    });	
	} 
	
    private class RunCheckboxes implements Runnable {
        boolean state;
		int step, buttonone=0, buttonlast= box.size()-1;
         void states(boolean state) {
             this.state = state;
        }
        public void run() {
            while (state) {
            	
            	if (step == box.size()) {
                    step = 0;
                    buttonone = 0;
                    buttonlast = box.size() - 1;
                }
                buttonone = step;    
               Display.getDefault().asyncExec(() -> box.get(buttonone).setSelection(!box.get(buttonone).getSelection()));
                step++;
                        try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}      
                }
            }
       }
    
}
