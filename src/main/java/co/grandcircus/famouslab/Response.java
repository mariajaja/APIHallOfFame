/**
 * 
 */
package co.grandcircus.famouslab;

import java.util.List;

/**
 * @author Mariah
 *
 */
public class Response {

	private List<Complete> complete;
	private List<Tiny> tiny;
	
	public List<Complete> getComplete() {
		return complete;
	}
	public void setComplete(List<Complete> complete) {
		this.complete = complete;
	}
	public List<Tiny> getTiny() {
		return tiny;
	}
	public void setTiny(List<Tiny> tiny) {
		this.tiny = tiny;
	}
	
	@Override
	public String toString() {
		return "TinyResponse [complete=" + complete + ", tiny=" + tiny + "]";
	}
	
}
