package hemologica.pixpdq.utils;

import hemologica.pixpdq.message.QBP_Q22;
import hemologica.pixpdq.message.QBP_Q23;
import ca.uhn.hl7v2.model.v231.message.ADT_A04;
import ca.uhn.hl7v2.model.v231.message.ADT_A08;
import ca.uhn.hl7v2.model.v231.message.ADT_A31;
import ca.uhn.hl7v2.model.v231.message.ADT_A40;
import ca.uhn.hl7v2.model.v26.message.ADT_A01;
import ca.uhn.hl7v2.model.v26.message.QCN_J01;

public class CreateMessageUtilsImpl implements ICreateMessageUtils {

	public ADT_A01 create_ADT_A01() {
		// TODO Auto-generated method stub
		ADT_A01 msg = new ADT_A01();
		return msg;
	}

	public ADT_A04 create_ADT_A04() {
		// TODO Auto-generated method stub
		ADT_A04 msg = new ADT_A04();
		return msg;
	}

	public ADT_A08 create_ADT_A08() {
		// TODO Auto-generated method stub
		ADT_A08 msg = new ADT_A08();
		return msg;
	}

	public ADT_A31 create_ADT_A31() {
		// TODO Auto-generated method stub
		ADT_A31 msg = new ADT_A31();
		return msg;
	}
	
	public ADT_A40 create_ADT_A40() {
		// TODO Auto-generated method stub
		ADT_A40 msg = new ADT_A40();
		return msg;
	}

	public QBP_Q22 create_QBP_Q22() {
		// TODO Auto-generated method stub
		QBP_Q22 msg = new QBP_Q22();
		return msg;
	}

	public QBP_Q23 create_QBP_Q23() {
		// TODO Auto-generated method stub
		QBP_Q23 msg = new QBP_Q23();
		return msg;
	}

	public QCN_J01 create_QCN_J01() {
		// TODO Auto-generated method stub
		QCN_J01 msg = new QCN_J01();
		return msg;
	}

}
