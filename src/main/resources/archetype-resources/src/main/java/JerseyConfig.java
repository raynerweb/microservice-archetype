#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import ${package}.exception.mapper.RuntimeExceptionMapper;

@ApplicationPath("/rest")
@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		filters();
		uploadSupport();
		exceptionMapper();
	}
	
	private void filters(){
		register(CORSFilter.class);
	}
	
	private void uploadSupport(){
		register(MultiPartFeature.class);
	}
	
	private void exceptionMapper(){
		register(RuntimeExceptionMapper.class);	
	}
	
}
