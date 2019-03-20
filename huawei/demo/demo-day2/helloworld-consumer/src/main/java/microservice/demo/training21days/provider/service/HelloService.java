package microservice.demo.training21days.provider.service;

// 瀹氫箟RPC璋冪敤鏂瑰紡鎵�浣跨敤鐨勪唬鐞嗘帴鍙�
public interface HelloService {
  // 鏂规硶鍚嶇О涓巔rovider鏈嶅姟濂戠害涓殑 operationId 淇濇寔涓�鑷�
  // 鍙傛暟椤哄簭涓巔rovider鏈嶅姟濂戠害涓畾涔夌殑椤哄簭淇濇寔涓�鑷�
  String sayHello(String name);
}


