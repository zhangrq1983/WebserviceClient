package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;

import com.webservice.*;

public class test {

	public static void main(String[] args) throws ServiceException, RemoteException, MalformedURLException {
		WeatherWebServiceLocator locator = new WeatherWebServiceLocator();
		WeatherWebServiceSoap12Stub service = (WeatherWebServiceSoap12Stub) locator.getPort(WeatherWebServiceSoap12Stub.class);
		invokeGetSupportProvince(service);
		System.out.println("...................");

		int count = 0;
		WeatherWebServiceSoap_PortType portType = locator.getWeatherWebServiceSoap();
		String[] s_arr =portType.getSupportProvince();

		for (String str : s_arr) {
			if (0 != count && count % 5 == 0) {
				System.out.println();
			}
			System.out.print(str + "\t");
			count++;
		}
		System.out.println("...................");

		count = 0;
		// 服务端web service 的wsdl地址
		URL endpointURL = new URL("http://www.webxml.com.cn/WebServices/WeatherWebService.asmx");
		// 通过wsdl地址与service获取Proxy
		WeatherWebServiceSoap12Stub stub = new WeatherWebServiceSoap12Stub(endpointURL, locator);
		// 调用接口
		String[] basicInfo = stub.getSupportProvince();

		// 响应信息

		for (String str : basicInfo) {
			if (0 != count && count % 5 == 0) {
				System.out.println();
			}
			System.out.print(str + "\t");
			count++;
		}

//		HrmServiceLocator hrmServiceLocator = new HrmServiceLocator();
//		HrmServicePortType binding = hrmServiceLocator.getHrmServiceHttpPort();
//		java.lang.String value = null;
//		value = binding.synSubCompany(new java.lang.String(), new java.lang.String());

	}
	
	    // 调用获取支持的省份、州接口
	    public static void invokeGetSupportProvince(
	            WeatherWebServiceSoap12Stub service) throws RemoteException {
	        String[] provices = service.getSupportProvince();
	         System.out.println("总共" + provices.length + "个");
	        int count = 0;
	        for (String str : provices) {
	             if (0 != count && count % 5 == 0) {
	                System.out.println();
	            }
	            System.out.print(str + "\t");
	             count++;
	        }
			System.out.println();
	    }
}
