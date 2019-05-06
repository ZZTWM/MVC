package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class ContextAttributeListener implements ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent e) {
        System.out.println("�������� ");
        System.out.println("������" + e.getName());
        System.out.println("ֵ��" + e.getValue());
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		System.out.println("�Ƴ����� ");
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		System.out.println("�滻����");
	}

}
