package 集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
/**
 * 组合牌
 * 洗牌
 * 发牌
 * 看牌
 * @author hancy
 * 2017年8月27日
 */
public class 斗地主 {
	//键是编号，值是牌
	private static HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
	//存储每张牌对应的编号
	private static ArrayList<Integer> arrayList = new ArrayList<Integer>();
	//存储玩家的牌号以及底牌
	private static ArrayList<Integer> player1 = new ArrayList<Integer>();
	private static ArrayList<Integer> player2 = new ArrayList<Integer>();
	private static ArrayList<Integer> player3 = new ArrayList<Integer>();
	private static ArrayList<Integer> threeHand = new ArrayList<Integer>();

	public static void main(String[] args) {
		cardGroup();
		shuffleCard();
		hairCard();
		lookCard();
	}
	
	/**
	 * 组合牌
	 */
	public static void cardGroup(){
		//定义13种牌的数组
		String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
		//定义四种花色
		String[] colors = {"♥", "♠", "♣", "♦"};
		
		//添加大小王
		hashMap.put(0, "大王");
		arrayList.add(0);
		hashMap.put(1, "小王");
		arrayList.add(1);
		
		//编号从下标2开始，0和1用于存储大小王
		int index = 2;
		for(String number : numbers){
			for(String color : colors){
				hashMap.put(index, color+number);
				arrayList.add(index);
				index++;
			}
		}
	}
	
	/**
	 * 洗牌
	 */
	public static void shuffleCard(){
		//为了没次发的牌不一样，需将存储牌号的集合元素顺序打乱
		Collections.shuffle(arrayList);
	}
	
	/**
	 * 发牌
	 */
	public static void hairCard(){
		//给三个玩家轮流发牌，得到的是牌的编号
		for(int i = 0; i < arrayList.size()-3; i++){
			int num = i % 3;
			switch (num) {
			case 0:
				player1.add(arrayList.get(i));
				break;
			case 1:
				player2.add(arrayList.get(i));
				break;
			case 2:
				player3.add(arrayList.get(i));
				break;
			}
		}
		//把最后三张牌放入底牌
		for(int i = arrayList.size()-3; i < arrayList.size(); i++){
			threeHand.add(arrayList.get(i));
		}
	}
	
	public static void lookCard(){
		//存储玩家与底牌
		ArrayList<ArrayList<Integer>> players = new ArrayList<ArrayList<Integer>>();
		players.add(player1);
		players.add(player2);
		players.add(player3);
		players.add(threeHand);
		
		int num = 1;
		for(ArrayList<Integer> arrayList : players){
			//给每个玩家和底牌进行排序
			Collections.sort(arrayList);
			if(arrayList.size() != 3){
				System.out.print("玩家" + num + "的牌: [ ");
			} else {
				System.out.print("底牌是: [ ");
			}
			//遍历每个玩家和底牌的牌号，并得到对应的牌
			for(Integer key : arrayList){
				String value = hashMap.get(key);
				System.out.print(value + "  ");
			}
			System.out.println(" ]");
			num++;
		}
	}
	
}
