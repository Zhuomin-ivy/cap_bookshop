package customer.bookshop.handlers;

import com.sap.cds.ql.cqn.CqnSelect;
import com.sap.cds.services.EventContext;
import com.sap.cds.services.EventName;

import cds.gen.sap.capire.bookshop.Reviews;

@EventName("review")
public interface ReviewEventContext extends EventContext{

    CqnSelect getCqn();
    void setCqn(CqnSelect select);
    
    Integer getStars();
    void setStars(Integer stars);

    void setResult(Reviews review);
    Reviews getResult();
}
