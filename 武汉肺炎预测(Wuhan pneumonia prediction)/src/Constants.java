/**
 * 模拟参数
 *
 * @ClassName: Constants
 * @Description: Simulation parameters
 * @author: Mingwei
 * @date: 2020年02月02日 21:40
 */
public class Constants {

    public static int ORIGINAL_COUNT = 50;//Initial number of infections
    public static float BROAD_RATE = 0.8f;//Transmission rates
    public static float SHADOW_TIME = 140;//Incubation time, 14 days is 140
    public static int HOSPITAL_RECEIVE_TIME = 10;//Hospital response time
    public static int BED_COUNT = 1000;//Hospital beds
    public static int CITY_CENTER = 400;//City center coordinates
    /**
     * 流动意向平均值，建议调整范围：[-0.99,0.99]
     * Mean value of flow intention, recommended adjustment range: [-0.99,0.99]
     * <p>
     * -0.99 人群流动最慢速率，甚至完全控制疫情传播
     * 0.99为人群流动最快速率, 可导致全城感染
     * Slowest rate of population flow, or even complete control of epidemic transmission
     * 0.99 is the fastest rate of population flow and can lead to city-wide infection
     */
    public static float u = 0.99f;
    public static int CITY_PERSON_SIZE = 5000;//Total urban population
    public static float FATALITY_RATE = 0.50f;//the fatality rate was estimated to be 0.02 according to the data on February 6
    public static int DIE_TIME = 100;//The mean time of death, 30 days, was measured from the time of onset (diagnosis)
    public static double DIE_VARIANCE = 1;//Variance of time of death
    /**
     * 城市大小即窗口边界，限制不允许出城
     * The size of the city is the window boundary, the limit is not allowed out of the city
     */
    public static final int CITY_WIDTH = 700;
    public static final int CITY_HEIGHT = 800;

}
