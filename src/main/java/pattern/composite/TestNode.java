package pattern.composite;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @author : Lin Can
 * @description : 测试组合模式在解析xml的node节点中的应用
 * @modified ：By
 * @date : 2018/5/28 8:20
 */
public class TestNode {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        //获取Builder的工厂实例
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        //通过工厂获得Builder实例
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        //document也是继承了node节点
        Document document = documentBuilder.parse("E:/lesson/7-DP/1.xml");
        //打印节点
        print(document,0);
    }


    /**
     * @author : Lin Can
     * @description : 打印节点
     * @dateCreated : 2018/5/28 8:44
     * @Param node 节点
    * @Param depth  深度
     * @Return :
     */
    static void print(Node node,int depth) {
        System.out.println(repeatTab(depth)+node.getNodeName());
        NodeList nodeList = node.getChildNodes();
        for (int i=0;i<nodeList.getLength();i++) {
            Node child = nodeList.item(i);
            print(child,depth+1);
        }
    }

    /**
     * @author : Lin Can
     * @description : 打印若干个tab
     * @dateCreated : 2018/5/28 8:33
     * @Param count 打印的个数
     * @Return :
     */
    static String repeatTab (int count) {
        StringBuilder tabSb = new StringBuilder();
        for (int i=0;i<count;i++) {
            tabSb.append("\t");
        }
        return tabSb.toString();
    }
}
