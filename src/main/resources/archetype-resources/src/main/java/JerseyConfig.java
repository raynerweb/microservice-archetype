#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@ApplicationPath("/rest")
@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		packages("${package}.resource");
		register(CORSFilter.class);
		
		uploadSupport();
	}
	
	private void uploadSupport(){
		register(MultiPartFeature.class);
	}
	
}
