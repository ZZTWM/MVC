package listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestListener implements ServletRequestListener, ServletRequestAttributeListener{

	@Override
	public void attributeAdded(ServletRequestAttributeEvent e) {
        System.out.println("request �������� ");
        System.out.println("������" + e.getName());
        System.out.println("ֵ��" + e.getValue());
		
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent e) {
		System.out.println("request �Ƴ����� ");
		
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent e) {
		System.out.println("request �滻���� ");
		
	}

	@Override
	public void requestDestroyed(ServletRequestEvent e) {
		System.out.println("������һ��Request ");
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent e) {
		System.out.println("������һ��Request ");
		
	}

}
