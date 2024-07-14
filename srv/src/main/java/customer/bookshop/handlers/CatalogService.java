package customer.bookshop.handlers;

import org.springframework.stereotype.Component;

import com.sap.cds.ql.cqn.CqnSelect;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.On;
import com.sap.cds.services.handler.annotations.ServiceName;

import cds.gen.adminservice.Books_;
import cds.gen.catalogservice.CatalogService_;
import cds.gen.sap.capire.bookshop.Reviews;

@Component
@ServiceName(CatalogService_.CDS_NAME)
public class CatalogService implements EventHandler{
    
    @On(event = "review", entity = Books_.CDS_NAME)
    public void reviewAction(ReviewEventContext context){
        CqnSelect selectBook = context.getCqn();
        Integer stars = context.getStars();
        Reviews review = Reviews.create();
        context.setResult(review);
    }
    
}
