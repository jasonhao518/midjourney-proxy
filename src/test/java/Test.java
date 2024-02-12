import java.net.MalformedURLException;

import eu.maxschuster.dataurl.DataUrl;
import eu.maxschuster.dataurl.DataUrlSerializer;
import eu.maxschuster.dataurl.IDataUrlSerializer;

public class Test {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		String base64 = "data:web/url;base64,aHR0cHM6Ly93d3cuYmFpZHUuY29t";
		IDataUrlSerializer serializer = new DataUrlSerializer();
		DataUrl dataUrl = serializer.unserialize(base64);
	}

}
