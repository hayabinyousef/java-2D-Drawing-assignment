import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;

class Dora extends JPanel {
    private static final Path2D path = new Path2D.Float();
    private static final AffineTransform m = new AffineTransform();
    private static float od;
    protected static Color tint = null;

    // Sets the color to use when drawing the SVG. This replaces
    // all parts of the drawable which are not completely transparent with this color.

    // Main method to run as a standalone Java application
 public static void main(String[] args) {
        JFrame frame = new JFrame("Dora Drawing");
        Dora panel = new Dora();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.add(panel);
        frame.setVisible(true);
    }



    public static void draw(Graphics g, int w, int h, int dx, int dy) {
        Graphics2D g2 = (Graphics2D) g;
        float ow = 720;
        float oh = 800f;

        // Scaling factor based on width and height
        od = Math.min(w / ow, h / oh);

        resetTransform();
        g2.translate((w - od * ow) / 2f + dx, (h - od * oh) / 2f + dy);
        g2.scale(od, od);

        if (tint != null) {
            g2.setColor(tint);
        } else {
            g2.setColor(Color.BLACK);
        }

        // Apply transformations to path and fill
        AffineTransform transform = new AffineTransform();
        transform.scale(0.1, -0.1);
        transform.translate(400, -8000); // Adjusting coordinates to fit the visible area
        g2.setTransform(transform);

        // Define the path
        path.reset();
        path.moveTo(2179.0f,7403.0f);
        path.curveTo(2160.0f,7347.0f,2156.0f,7314.0f,2155.0f,7210.0f);
        path.curveTo(2155.0f,7141.0f,2159.0f,7054.0f,2163.0f,7017.0f);
        path.curveTo(2169.0f,6963.0f,2168.0f,6949.0f,2158.0f,6952.0f);
        path.curveTo(2134.0f,6960.0f,2038.0f,7096.0f,1994.0f,7185.0f);
        path.curveTo(1945.0f,7284.0f,1938.0f,7285.0f,1973.0f,7187.0f);
        path.curveTo(2003.0f,7106.0f,2042.0f,7038.0f,2092.0f,6985.0f);
        path.curveTo(2113.0f,6962.0f,2130.0f,6939.0f,2130.0f,6933.0f);
        path.curveTo(2130.0f,6928.0f,2037.0f,6924.0f,1903.0f,6925.0f);
        path.curveTo(1736.0f,6925.0f,1665.0f,6921.0f,1637.0f,6912.0f);
        path.curveTo(1588.0f,6894.0f,1320.0f,6631.0f,1228.0f,6509.0f);
        path.curveTo(1033.0f,6253.0f,900.0f,6015.0f,780.0f,5705.0f);
        path.curveTo(756.0f,5645.0f,734.0f,5586.0f,729.0f,5575.0f);
        path.curveTo(722.0f,5558.0f,679.0f,5419.0f,650.0f,5325.0f);
        path.curveTo(623.0f,5234.0f,550.0f,4898.0f,550.0f,4864.0f);
        path.curveTo(550.0f,4851.0f,738.0f,4710.0f,845.0f,4643.0f);
        path.curveTo(1237.0f,4398.0f,1704.0f,4253.0f,2116.0f,4249.0f);
        path.curveTo(2173.0f,4249.0f,2222.0f,4245.0f,2225.0f,4240.0f);
        path.curveTo(2228.0f,4236.0f,2199.0f,4214.0f,2162.0f,4192.0f);
        path.curveTo(2055.0f,4128.0f,2035.0f,4101.0f,2011.0f,3990.0f);
        path.curveTo(2000.0f,3938.0f,1982.0f,3841.0f,1971.0f,3774.0f);
        path.curveTo(1959.0f,3708.0f,1941.0f,3627.0f,1929.0f,3594.0f);
        path.curveTo(1918.0f,3562.0f,1908.0f,3516.0f,1907.0f,3492.0f);
        path.curveTo(1905.0f,3454.0f,1909.0f,3444.0f,1941.0f,3416.0f);
        path.curveTo(1961.0f,3398.0f,1983.0f,3381.0f,1990.0f,3378.0f);
        path.curveTo(2001.0f,3375.0f,2001.0f,3347.0f,1987.0f,3214.0f);
        path.curveTo(1951.0f,2859.0f,1952.0f,2828.0f,2009.0f,2773.0f);
        path.curveTo(2093.0f,2691.0f,2220.0f,2653.0f,2379.0f,2663.0f);
        path.lineTo(2477.0f,2669.0f);
        path.lineTo(2463.0f,2597.0f);
        path.curveTo(2452.0f,2545.0f,2450.0f,2485.0f,2454.0f,2380.0f);
        path.curveTo(2457.0f,2300.0f,2463.0f,2135.0f,2466.0f,2014.0f);
        path.lineTo(2473.0f,1792.0f);
        path.lineTo(2531.0f,1781.0f);
        path.lineTo(2590.0f,1769.0f);
        path.lineTo(2590.0f,1727.0f);
        path.curveTo(2590.0f,1660.0f,2618.0f,1491.0f,2641.0f,1420.0f);
        path.curveTo(2691.0f,1262.0f,2762.0f,1182.0f,2927.0f,1097.0f);
        path.curveTo(2982.0f,1069.0f,3010.0f,1049.0f,3010.0f,1038.0f);
        path.curveTo(3010.0f,1029.0f,2995.0f,957.0f,2976.0f,878.0f);
        path.curveTo(2938.0f,721.0f,2881.0f,463.0f,2854.0f,330.0f);
        path.curveTo(2826.0f,193.0f,2845.0f,162.0f,2988.0f,110.0f);
        path.curveTo(3181.0f,40.0f,3364.0f,10.0f,3600.0f,10.0f);
        path.curveTo(3894.0f,10.0f,3996.0f,51.0f,3968.0f,156.0f);
        path.curveTo(3960.0f,186.0f,3964.0f,192.0f,4029.0f,257.0f);
        path.curveTo(4186.0f,414.0f,4283.0f,726.0f,4266.0f,1019.0f);
        path.curveTo(4259.0f,1147.0f,4226.0f,1292.0f,4197.0f,1326.0f);
        path.curveTo(4167.0f,1360.0f,4085.0f,1381.0f,3960.0f,1385.0f);
        path.curveTo(3902.0f,1386.0f,3854.0f,1388.0f,3853.0f,1389.0f);
        path.curveTo(3851.0f,1391.0f,4015.0f,1792.0f,4029.0f,1818.0f);
        path.curveTo(4035.0f,1830.0f,4053.0f,1843.0f,4068.0f,1846.0f);
        path.curveTo(4083.0f,1850.0f,4116.0f,1862.0f,4143.0f,1873.0f);
        path.lineTo(4190.0f,1892.0f);
        path.lineTo(4190.0f,1989.0f);
        path.curveTo(4190.0f,2105.0f,4212.0f,2305.0f,4240.0f,2432.0f);
        path.curveTo(4286.0f,2646.0f,4315.0f,2949.0f,4291.0f,2964.0f);
        path.curveTo(4273.0f,2975.0f,4278.0f,2990.0f,4300.0f,2990.0f);
        path.curveTo(4326.0f,2990.0f,4334.0f,3025.0f,4327.0f,3115.0f);
        path.lineTo(4322.0f,3188.0f);
        path.lineTo(4369.0f,3218.0f);
        path.curveTo(4423.0f,3251.0f,4466.0f,3303.0f,4486.0f,3357.0f);
        path.curveTo(4507.0f,3416.0f,4503.0f,3534.0f,4478.0f,3613.0f);
        path.curveTo(4457.0f,3681.0f,4457.0f,3681.0f,4477.0f,3708.0f);
        path.curveTo(4511.0f,3755.0f,4511.0f,3767.0f,4473.0f,3837.0f);
        path.curveTo(4368.0f,4036.0f,4188.0f,4241.0f,4046.0f,4323.0f);
        path.curveTo(3968.0f,4369.0f,3900.0f,4396.0f,3746.0f,4443.0f);
        path.curveTo(3702.0f,4456.0f,3665.0f,4471.0f,3663.0f,4476.0f);
        path.curveTo(3662.0f,4481.0f,3684.0f,4496.0f,3713.0f,4509.0f);
        path.curveTo(3787.0f,4542.0f,3960.0f,4643.0f,4062.0f,4712.0f);
        path.curveTo(4494.0f,5001.0f,4846.0f,5433.0f,5027.0f,5894.0f);
        path.curveTo(5082.0f,6035.0f,5086.0f,6059.0f,5065.0f,6101.0f);
        path.curveTo(5011.0f,6207.0f,4855.0f,6409.0f,4708.0f,6561.0f);
        path.curveTo(4225.0f,7064.0f,3419.0f,7433.0f,2860.0f,7406.0f);
        path.curveTo(2631.0f,7396.0f,2521.0f,7357.0f,2412.0f,7248.0f);
        path.curveTo(2352.0f,7188.0f,2256.0f,7057.0f,2229.0f,6998.0f);
        path.curveTo(2222.0f,6982.0f,2211.0f,6970.0f,2204.0f,6970.0f);
        path.curveTo(2177.0f,6970.0f,2173.0f,7341.0f,2199.0f,7429.0f);
        path.curveTo(2218.0f,7493.0f,2202.0f,7472.0f,2179.0f,7403.0f);
        g2.setColor(Color.decode("#572500"));

        g2.fill(path);
        g2.draw(path);

        path.reset();
        path.moveTo(3205.0f,6442.0f);
        path.curveTo(3270.0f,6390.0f,3344.0f,6303.0f,3375.0f,6243.0f);
        path.curveTo(3385.0f,6222.0f,3395.0f,6204.0f,3396.0f,6202.0f);
        path.curveTo(3396.0f,6201.0f,3444.0f,6209.0f,3501.0f,6220.0f);
        path.curveTo(3656.0f,6251.0f,3791.0f,6269.0f,3926.0f,6276.0f);
        path.lineTo(4047.0f,6283.0f);
        path.lineTo(4090.0f,6210.0f);
        path.curveTo(4185.0f,6048.0f,4268.0f,5834.0f,4290.0f,5698.0f);
        path.curveTo(4311.0f,5572.0f,4299.0f,5423.0f,4260.0f,5315.0f);
        path.curveTo(4190.0f,5118.0f,4102.0f,4980.0f,3951.0f,4829.0f);
        path.curveTo(3840.0f,4718.0f,3782.0f,4672.0f,3665.0f,4603.0f);
        path.curveTo(3377.0f,4431.0f,2948.0f,4325.0f,2620.0f,4345.0f);
        path.curveTo(2296.0f,4364.0f,2025.0f,4467.0f,1854.0f,4635.0f);
        path.curveTo(1731.0f,4757.0f,1667.0f,4889.0f,1621.0f,5119.0f);
        path.curveTo(1604.0f,5204.0f,1602.0f,5231.0f,1611.0f,5307.0f);
        path.curveTo(1616.0f,5355.0f,1627.0f,5404.0f,1635.0f,5416.0f);
        path.curveTo(1650.0f,5440.0f,1911.0f,5638.0f,2027.0f,5715.0f);
        path.lineTo(2099.0f,5762.0f);
        path.lineTo(2092.0f,5809.0f);
        path.curveTo(2082.0f,5871.0f,2083.0f,6090.0f,2093.0f,6115.0f);
        path.curveTo(2100.0f,6132.0f,2103.0f,6133.0f,2109.0f,6120.0f);
        path.curveTo(2114.0f,6112.0f,2121.0f,6085.0f,2124.0f,6060.0f);
        path.curveTo(2128.0f,6035.0f,2139.0f,5992.0f,2148.0f,5965.0f);
        path.curveTo(2165.0f,5916.0f,2216.0f,5820.0f,2225.0f,5820.0f);
        path.curveTo(2228.0f,5820.0f,2258.0f,5833.0f,2292.0f,5849.0f);
        path.curveTo(2584.0f,5985.0f,2972.0f,6127.0f,3185.0f,6175.0f);
        path.curveTo(3224.0f,6184.0f,3258.0f,6194.0f,3262.0f,6198.0f);
        path.curveTo(3278.0f,6214.0f,3205.0f,6381.0f,3144.0f,6468.0f);
        path.curveTo(3118.0f,6503.0f,3141.0f,6494.0f,3205.0f,6442.0f);
        g2.setColor(Color.decode("#f9a25d"));
        g2.fill(path);
        g2.draw(path);


        path.reset();
        path.moveTo(3440.0f,4406.0f);
        path.curveTo(3440.0f,4359.0f,3436.0f,4347.0f,3410.0f,4322.0f);
        path.curveTo(3394.0f,4305.0f,3359.0f,4285.0f,3333.0f,4275.0f);
        path.curveTo(3269.0f,4254.0f,3129.0f,4245.0f,3056.0f,4259.0f);
        path.curveTo(2990.0f,4271.0f,2880.0f,4309.0f,2880.0f,4320.0f);
        path.curveTo(2880.0f,4323.0f,2920.0f,4332.0f,2970.0f,4338.0f);
        path.curveTo(3072.0f,4352.0f,3301.0f,4408.0f,3375.0f,4438.0f);
        path.curveTo(3403.0f,4449.0f,3428.0f,4458.0f,3433.0f,4459.0f);
        path.curveTo(3437.0f,4460.0f,3440.0f,4436.0f,3440.0f,4406.0f);
        g2.setColor(Color.decode("#f9a25d"));
        g2.fill(path);
        g2.draw(path);



        path.reset();
        path.moveTo(3569.0f,4429.0f);
        path.curveTo(3593.0f,4424.0f,3625.0f,4410.0f,3641.0f,4400.0f);
        path.curveTo(3678.0f,4373.0f,3686.0f,4375.0f,3665.0f,4406.0f);
        path.lineTo(3648.0f,4433.0f);
        path.lineTo(3681.0f,4426.0f);
        path.curveTo(3817.0f,4399.0f,3993.0f,4108.0f,4024.0f,3856.0f);
        path.lineTo(4032.0f,3798.0f);
        path.lineTo(3985.0f,3830.0f);
        path.curveTo(3957.0f,3849.0f,3929.0f,3881.0f,3912.0f,3911.0f);
        path.curveTo(3816.0f,4088.0f,3671.0f,4271.0f,3555.0f,4363.0f);
        path.curveTo(3528.0f,4385.0f,3499.0f,4411.0f,3492.0f,4421.0f);
        path.curveTo(3480.0f,4438.0f,3481.0f,4440.0f,3502.0f,4440.0f);
        path.curveTo(3515.0f,4440.0f,3545.0f,4435.0f,3569.0f,4429.0f);
        g2.setColor(Color.decode("#b1a2cd"));
        g2.fill(path);
        g2.draw(path);





        path.reset();
        path.moveTo(3497.0f,4337.0f);
        path.curveTo(3505.0f,4287.0f,3486.0f,4246.0f,3442.0f,4218.0f);
        path.curveTo(3330.0f,4145.0f,3124.0f,4133.0f,2987.0f,4192.0f);
        path.curveTo(2923.0f,4220.0f,2819.0f,4290.0f,2825.0f,4300.0f);
        path.curveTo(2828.0f,4305.0f,2853.0f,4297.0f,2882.0f,4283.0f);
        path.curveTo(2977.0f,4237.0f,3082.0f,4217.0f,3195.0f,4223.0f);
        path.curveTo(3251.0f,4226.0f,3316.0f,4235.0f,3343.0f,4245.0f);
        path.curveTo(3408.0f,4268.0f,3470.0f,4327.0f,3470.0f,4365.0f);
        path.curveTo(3470.0f,4405.0f,3489.0f,4384.0f,3497.0f,4337.0f);
        g2.setColor(Color.decode("#ef83b5"));
        g2.fill(path);
        g2.draw(path);



        path.reset();
        path.moveTo(4014.0f,4273.0f);
        path.curveTo(4136.0f,4194.0f,4269.0f,4053.0f,4363.0f,3900.0f);
        path.curveTo(4413.0f,3821.0f,4412.0f,3810.0f,4355.0f,3810.0f);
        path.curveTo(4328.0f,3810.0f,4169.0f,3788.0f,4094.0f,3774.0f);
        path.lineTo(4063.0f,3768.0f);
        path.lineTo(4057.0f,3837.0f);
        path.curveTo(4043.0f,3985.0f,3969.0f,4184.0f,3885.0f,4301.0f);
        path.curveTo(3866.0f,4328.0f,3850.0f,4352.0f,3850.0f,4354.0f);
        path.curveTo(3850.0f,4364.0f,3949.0f,4315.0f,4014.0f,4273.0f);
        g2.setColor(Color.decode("#ef83b5"));

        g2.fill(path);
        g2.draw(path);



        path.reset();
        path.moveTo(3652.0f,4226.0f);
        path.curveTo(3716.0f,4157.0f,3800.0f,4040.0f,3846.0f,3956.0f);
        path.curveTo(3877.0f,3899.0f,3880.0f,3889.0f,3864.0f,3893.0f);
        path.curveTo(3791.0f,3915.0f,3746.0f,3922.0f,3672.0f,3926.0f);
        path.curveTo(3615.0f,3928.0f,3582.0f,3934.0f,3570.0f,3945.0f);
        path.curveTo(3550.0f,3963.0f,3507.0f,3965.0f,3477.0f,3948.0f);
        path.curveTo(3465.0f,3941.0f,3443.0f,3937.0f,3428.0f,3939.0f);
        path.curveTo(3394.0f,3942.0f,3363.0f,3926.0f,3355.0f,3900.0f);
        path.curveTo(3352.0f,3889.0f,3340.0f,3880.0f,3330.0f,3880.0f);
        path.curveTo(3306.0f,3880.0f,3260.0f,3859.0f,3260.0f,3849.0f);
        path.curveTo(3260.0f,3844.0f,3247.0f,3834.0f,3231.0f,3826.0f);
        path.curveTo(3196.0f,3807.0f,3186.0f,3773.0f,3206.0f,3742.0f);
        path.curveTo(3224.0f,3714.0f,3220.0f,3708.0f,3160.0f,3672.0f);
        path.lineTo(3125.0f,3651.0f);
        path.lineTo(3125.0f,3773.0f);
        path.curveTo(3125.0f,3915.0f,3105.0f,3988.0f,3039.0f,4091.0f);
        path.curveTo(3010.0f,4136.0f,3004.0f,4151.0f,3017.0f,4146.0f);
        path.curveTo(3063.0f,4128.0f,3152.0f,4118.0f,3230.0f,4123.0f);
        path.curveTo(3404.0f,4134.0f,3530.0f,4209.0f,3530.0f,4301.0f);
        path.lineTo(3530.0f,4342.0f);
        path.lineTo(3568.0f,4310.0f);
        path.curveTo(3588.0f,4292.0f,3626.0f,4255.0f,3652.0f,4226.0f);
        g2.setColor(Color.decode("#ef83b5"));
        g2.fill(path);
        g2.draw(path);



        path.reset();
        path.moveTo(2845.0f,4235.0f);
        path.curveTo(2923.0f,4190.0f,3011.0f,4091.0f,3051.0f,4003.0f);
        path.curveTo(3108.0f,3878.0f,3114.0f,3665.0f,3063.0f,3608.0f);
        path.curveTo(3036.0f,3578.0f,3022.0f,3587.0f,2989.0f,3653.0f);
        path.curveTo(2972.0f,3687.0f,2944.0f,3735.0f,2928.0f,3758.0f);
        path.curveTo(2911.0f,3782.0f,2887.0f,3836.0f,2874.0f,3879.0f);
        path.curveTo(2847.0f,3967.0f,2804.0f,4037.0f,2751.0f,4079.0f);
        path.curveTo(2700.0f,4119.0f,2621.0f,4144.0f,2562.0f,4137.0f);
        path.curveTo(2520.0f,4132.0f,2517.0f,4133.0f,2535.0f,4146.0f);
        path.curveTo(2545.0f,4154.0f,2577.0f,4169.0f,2604.0f,4179.0f);
        path.curveTo(2632.0f,4189.0f,2679.0f,4214.0f,2709.0f,4234.0f);
        path.curveTo(2768.0f,4274.0f,2777.0f,4274.0f,2845.0f,4235.0f);
        g2.setColor(Color.decode("#b1a2cd"));
        g2.fill(path);
        g2.draw(path);

        path.reset();
        path.moveTo(2643.0f,4104.0f);
        path.curveTo(2707.0f,4082.0f,2783.0f,4011.0f,2814.0f,3945.0f);
        path.curveTo(2848.0f,3875.0f,2847.0f,3870.0f,2808.0f,3906.0f);
        path.curveTo(2790.0f,3922.0f,2780.0f,3928.0f,2786.0f,3920.0f);
        path.curveTo(2901.0f,3752.0f,2990.0f,3600.0f,2990.0f,3572.0f);
        path.curveTo(2990.0f,3555.0f,2945.0f,3532.0f,2894.0f,3525.0f);
        path.curveTo(2754.0f,3504.0f,2587.0f,3413.0f,2458.0f,3286.0f);
        path.curveTo(2438.0f,3266.0f,2417.0f,3250.0f,2412.0f,3250.0f);
        path.curveTo(2407.0f,3250.0f,2390.0f,3307.0f,2374.0f,3378.0f);
        path.curveTo(2349.0f,3488.0f,2345.0f,3525.0f,2345.0f,3655.0f);
        path.curveTo(2346.0f,3793.0f,2348.0f,3810.0f,2372.0f,3872.0f);
        path.curveTo(2413.0f,3974.0f,2452.0f,4030.0f,2523.0f,4086.0f);
        path.curveTo(2572.0f,4124.0f,2580.0f,4125.0f,2643.0f,4104.0f);
        g2.setColor(Color.decode("#ef83b5"));
        g2.fill(path);
        g2.draw(path);

        path.reset();
        path.moveTo(3840.0f,3869.0f);
        path.curveTo(3917.0f,3844.0f,4001.0f,3790.0f,4037.0f,3743.0f);
        path.curveTo(4051.0f,3725.0f,4061.0f,3708.0f,4059.0f,3705.0f);
        path.curveTo(4056.0f,3703.0f,4014.0f,3692.0f,3965.0f,3681.0f);
        path.curveTo(3888.0f,3664.0f,3785.0f,3632.0f,3716.0f,3604.0f);
        path.curveTo(3700.0f,3598.0f,3698.0f,3600.0f,3703.0f,3620.0f);
        path.curveTo(3707.0f,3637.0f,3702.0f,3650.0f,3679.0f,3671.0f);
        path.curveTo(3663.0f,3686.0f,3650.0f,3706.0f,3650.0f,3717.0f);
        path.curveTo(3650.0f,3727.0f,3643.0f,3746.0f,3634.0f,3759.0f);
        path.curveTo(3622.0f,3776.0f,3621.0f,3785.0f,3629.0f,3793.0f);
        path.curveTo(3648.0f,3812.0f,3641.0f,3848.0f,3615.0f,3868.0f);
        path.curveTo(3601.0f,3879.0f,3590.0f,3891.0f,3590.0f,3895.0f);
        path.curveTo(3590.0f,3910.0f,3775.0f,3891.0f,3840.0f,3869.0f);
        g2.setColor(Color.decode("#f9a25d"));
        g2.fill(path);
        g2.draw(path);

        path.reset();
        path.moveTo(4392.0f,3733.0f);
        path.curveTo(4427.0f,3653.0f,4440.0f,3589.0f,4440.0f,3490.0f);
        path.curveTo(4440.0f,3381.0f,4424.0f,3335.0f,4369.0f,3282.0f);
        path.curveTo(4269.0f,3185.0f,4135.0f,3168.0f,3826.0f,3215.0f);
        path.lineTo(3644.0f,3243.0f);
        path.lineTo(3577.0f,3216.0f);
        path.curveTo(3541.0f,3202.0f,3496.0f,3187.0f,3479.0f,3183.0f);
        path.lineTo(3447.0f,3177.0f);
        path.lineTo(3493.0f,3243.0f);
        path.curveTo(3519.0f,3279.0f,3560.0f,3347.0f,3586.0f,3394.0f);
        path.curveTo(3630.0f,3476.0f,3633.0f,3480.0f,3666.0f,3480.0f);
        path.curveTo(3707.0f,3480.0f,3736.0f,3516.0f,3726.0f,3554.0f);
        path.curveTo(3721.0f,3576.0f,3725.0f,3580.0f,3776.0f,3599.0f);
        path.curveTo(3881.0f,3639.0f,4044.0f,3676.0f,4133.0f,3682.0f);
        path.curveTo(4173.0f,3684.0f,4185.0f,3699.0f,4148.0f,3701.0f);
        path.curveTo(4135.0f,3702.0f,4121.0f,3702.0f,4116.0f,3701.0f);
        path.curveTo(4106.0f,3699.0f,4080.0f,3720.0f,4080.0f,3730.0f);
        path.curveTo(4080.0f,3739.0f,4170.0f,3755.0f,4290.0f,3769.0f);
        path.curveTo(4331.0f,3774.0f,4366.0f,3778.0f,4368.0f,3779.0f);
        path.curveTo(4370.0f,3779.0f,4381.0f,3759.0f,4392.0f,3733.0f);
        g2.setColor(Color.decode("#f9a25d"));

        g2.fill(path);
        g2.draw(path);

        path.reset();
        path.moveTo(3360.0f,3745.0f);
        path.curveTo(3367.0f,3737.0f,3386.0f,3730.0f,3403.0f,3730.0f);
        path.curveTo(3420.0f,3730.0f,3442.0f,3722.0f,3452.0f,3713.0f);
        path.curveTo(3463.0f,3703.0f,3481.0f,3695.0f,3494.0f,3695.0f);
        path.curveTo(3523.0f,3693.0f,3580.0f,3651.0f,3573.0f,3635.0f);
        path.curveTo(3571.0f,3627.0f,3575.0f,3611.0f,3584.0f,3598.0f);
        path.curveTo(3592.0f,3585.0f,3600.0f,3554.0f,3601.0f,3529.0f);
        path.curveTo(3603.0f,3491.0f,3596.0f,3469.0f,3560.0f,3404.0f);
        path.curveTo(3444.0f,3191.0f,3301.0f,3031.0f,3168.0f,2966.0f);
        path.curveTo(2962.0f,2864.0f,2746.0f,2946.0f,2588.0f,3189.0f);
        path.curveTo(2529.0f,3280.0f,2521.0f,3306.0f,2546.0f,3326.0f);
        path.curveTo(2636.0f,3398.0f,2755.0f,3462.0f,2845.0f,3486.0f);
        path.lineTo(2895.0f,3499.0f);
        path.lineTo(2845.0f,3453.0f);
        path.curveTo(2818.0f,3428.0f,2802.0f,3410.0f,2810.0f,3413.0f);
        path.curveTo(2819.0f,3415.0f,2918.0f,3478.0f,3030.0f,3552.0f);
        path.curveTo(3143.0f,3627.0f,3249.0f,3694.0f,3265.0f,3703.0f);
        path.curveTo(3282.0f,3711.0f,3304.0f,3727.0f,3314.0f,3739.0f);
        path.curveTo(3337.0f,3764.0f,3344.0f,3765.0f,3360.0f,3745.0f);
        g2.setColor(Color.decode("#f9a25d"));
        g2.fill(path);
        g2.draw(path);

        path.reset();
        path.moveTo(3990.0f,3165.0f);
        path.curveTo(4084.0f,3154.0f,4145.0f,3152.0f,4193.0f,3158.0f);
        path.curveTo(4230.0f,3163.0f,4263.0f,3164.0f,4265.0f,3161.0f);
        path.curveTo(4266.0f,3158.0f,4270.0f,3126.0f,4272.0f,3090.0f);
        path.curveTo(4275.0f,3027.0f,4274.0f,3025.0f,4250.0f,3022.0f);
        path.curveTo(4236.0f,3020.0f,4144.0f,2998.0f,4045.0f,2974.0f);
        path.curveTo(3229.0f,2770.0f,2905.0f,2736.0f,2620.0f,2826.0f);
        path.curveTo(2502.0f,2863.0f,2508.0f,2850.0f,2530.0f,3020.0f);
        path.curveTo(2552.0f,3190.0f,2548.0f,3170.0f,2558.0f,3170.0f);
        path.curveTo(2563.0f,3170.0f,2581.0f,3150.0f,2598.0f,3126.0f);
        path.curveTo(2737.0f,2933.0f,2956.0f,2847.0f,3133.0f,2917.0f);
        path.curveTo(3199.0f,2943.0f,3300.0f,3013.0f,3365.0f,3079.0f);
        path.curveTo(3398.0f,3113.0f,3431.0f,3140.0f,3440.0f,3140.0f);
        path.curveTo(3448.0f,3141.0f,3499.0f,3158.0f,3554.0f,3178.0f);
        path.lineTo(3652.0f,3216.0f);
        path.lineTo(3754.0f,3198.0f);
        path.curveTo(3809.0f,3189.0f,3916.0f,3174.0f,3990.0f,3165.0f);
        g2.setColor(Color.decode("#f281b5"));
        g2.fill(path);
        g2.draw(path);

        path.reset();
        path.moveTo(4240.0f,2960.0f);
        path.curveTo(4240.0f,2938.0f,4120.0f,2879.0f,4039.0f,2861.0f);
        path.curveTo(3932.0f,2837.0f,3553.0f,2810.0f,3595.0f,2830.0f);
        path.curveTo(3619.0f,2841.0f,4011.0f,2936.0f,4130.0f,2959.0f);
        path.curveTo(4213.0f,2976.0f,4240.0f,2976.0f,4240.0f,2960.0f);
        path.moveTo(4235.0f,2823.0f);
        path.curveTo(4226.0f,2716.0f,4204.0f,2560.0f,4185.0f,2470.0f);
        path.curveTo(4157.0f,2337.0f,4140.0f,2199.0f,4133.0f,2058.0f);
        path.curveTo(4129.0f,1975.0f,4122.0f,1916.0f,4116.0f,1911.0f);
        path.curveTo(4095.0f,1893.0f,3929.0f,1850.0f,3838.0f,1839.0f);
        path.curveTo(3735.0f,1825.0f,3567.0f,1839.0f,3486.0f,1866.0f);
        path.lineTo(3440.0f,1882.0f);
        path.lineTo(3440.0f,1960.0f);
        path.lineTo(3440.0f,2037.0f);
        path.lineTo(3512.0f,2070.0f);
        path.curveTo(3552.0f,2087.0f,3608.0f,2107.0f,3637.0f,2113.0f);
        path.curveTo(3696.0f,2125.0f,3707.0f,2140.0f,3658.0f,2140.0f);
        path.curveTo(3612.0f,2140.0f,3557.0f,2124.0f,3478.0f,2088.0f);
        path.lineTo(3410.0f,2057.0f);
        path.lineTo(3410.0f,1924.0f);
        path.curveTo(3410.0f,1771.0f,3424.0f,1788.0f,3287.0f,1770.0f);
        path.curveTo(3117.0f,1748.0f,2852.0f,1762.0f,2610.0f,1806.0f);
        path.lineTo(2525.0f,1822.0f);
        path.lineTo(2521.0f,2058.0f);
        path.curveTo(2514.0f,2580.0f,2515.0f,2659.0f,2537.0f,2735.0f);
        path.curveTo(2551.0f,2784.0f,2561.0f,2804.0f,2571.0f,2802.0f);
        path.curveTo(2579.0f,2800.0f,2618.0f,2790.0f,2659.0f,2779.0f);
        path.curveTo(2826.0f,2736.0f,3006.0f,2733.0f,3265.0f,2770.0f);
        path.curveTo(3337.0f,2781.0f,3490.0f,2791.0f,3610.0f,2795.0f);
        path.curveTo(3927.0f,2804.0f,4045.0f,2821.0f,4160.0f,2873.0f);
        path.curveTo(4243.0f,2911.0f,4243.0f,2912.0f,4235.0f,2823.0f);
        g2.setColor(Color.decode("#f68934"));
        g2.fill(path);
        g2.draw(path);

        path.reset();
        path.moveTo(3544.0f,1822.0f);
        path.curveTo(3597.0f,1809.0f,3658.0f,1805.0f,3783.0f,1805.0f);
        path.curveTo(3875.0f,1805.0f,3950.0f,1802.0f,3950.0f,1797.0f);
        path.curveTo(3950.0f,1793.0f,3916.0f,1705.0f,3874.0f,1602.0f);
        path.curveTo(3832.0f,1499.0f,3796.0f,1409.0f,3793.0f,1403.0f);
        path.curveTo(3785.0f,1383.0f,3778.0f,1386.0f,3678.0f,1448.0f);
        path.curveTo(3596.0f,1499.0f,3584.0f,1510.0f,3575.0f,1545.0f);
        path.curveTo(3560.0f,1595.0f,3534.0f,1608.0f,3479.0f,1590.0f);
        path.curveTo(3441.0f,1577.0f,3438.0f,1578.0f,3415.0f,1601.0f);
        path.curveTo(3396.0f,1619.0f,3389.0f,1640.0f,3384.0f,1692.0f);
        path.lineTo(3377.0f,1758.0f);
        path.lineTo(3406.0f,1762.0f);
        path.curveTo(3432.0f,1765.0f,3435.0f,1769.0f,3438.0f,1808.0f);
        path.curveTo(3441.0f,1843.0f,3444.0f,1850.0f,3457.0f,1846.0f);
        path.curveTo(3465.0f,1842.0f,3505.0f,1832.0f,3544.0f,1822.0f);
        g2.setColor(Color.decode("#f9a25d"));
        g2.fill(path);
        g2.draw(path);

        path.reset();
        path.moveTo(2804.0f,1739.0f);
        path.curveTo(2909.0f,1729.0f,3289.0f,1730.0f,3329.0f,1741.0f);
        path.curveTo(3339.0f,1744.0f,3346.0f,1732.0f,3352.0f,1700.0f);
        path.curveTo(3371.0f,1595.0f,3377.0f,1585.0f,3430.0f,1556.0f);
        path.curveTo(3471.0f,1534.0f,3479.0f,1525.0f,3476.0f,1507.0f);
        path.curveTo(3473.0f,1495.0f,3468.0f,1454.0f,3464.0f,1415.0f);
        path.curveTo(3455.0f,1314.0f,3415.0f,1186.0f,3374.0f,1124.0f);
        path.curveTo(3339.0f,1072.0f,3256.0f,990.0f,3238.0f,990.0f);
        path.curveTo(3222.0f,990.0f,3048.0f,1081.0f,2959.0f,1136.0f);
        path.curveTo(2846.0f,1206.0f,2765.0f,1280.0f,2733.0f,1343.0f);
        path.curveTo(2698.0f,1412.0f,2662.0f,1562.0f,2654.0f,1671.0f);
        path.curveTo(2647.0f,1758.0f,2648.0f,1762.0f,2666.0f,1757.0f);
        path.curveTo(2676.0f,1754.0f,2738.0f,1746.0f,2804.0f,1739.0f);
        g2.setColor(Color.decode("#f9a25d"));
        g2.fill(path);
        g2.draw(path);

        path.reset();
        path.moveTo(3550.0f,1529.0f);
        path.curveTo(3550.0f,1513.0f,3540.0f,1482.0f,3528.0f,1461.0f);
        path.lineTo(3507.0f,1423.0f);
        path.lineTo(3528.0f,1402.0f);
        path.curveTo(3567.0f,1363.0f,3553.0f,1302.0f,3500.0f,1275.0f);
        path.lineTo(3470.0f,1259.0f);
        path.lineTo(3491.0f,1231.0f);
        path.curveTo(3526.0f,1184.0f,3502.0f,1127.0f,3433.0f,1091.0f);
        path.curveTo(3419.0f,1084.0f,3409.0f,1067.0f,3405.0f,1042.0f);
        path.curveTo(3390.0f,954.0f,3368.0f,926.0f,3313.0f,928.0f);
        path.curveTo(3286.0f,929.0f,3268.0f,922.0f,3243.0f,899.0f);
        path.curveTo(3185.0f,849.0f,3160.0f,874.0f,3191.0f,951.0f);
        path.curveTo(3199.0f,971.0f,3207.0f,976.0f,3224.0f,973.0f);
        path.curveTo(3253.0f,967.0f,3334.0f,1031.0f,3384.0f,1099.0f);
        path.curveTo(3419.0f,1147.0f,3457.0f,1227.0f,3466.0f,1275.0f);
        path.curveTo(3468.0f,1286.0f,3474.0f,1318.0f,3479.0f,1345.0f);
        path.curveTo(3497.0f,1436.0f,3503.0f,1537.0f,3491.0f,1544.0f);
        path.curveTo(3462.0f,1562.0f,3500.0f,1584.0f,3533.0f,1568.0f);
        path.curveTo(3543.0f,1563.0f,3550.0f,1548.0f,3550.0f,1529.0f);
        g2.setColor(Color.decode("#fde151"));
        g2.fill(path);
        g2.draw(path);

        path.reset();
        path.moveTo(3672.0f,1424.0f);
        path.curveTo(3827.0f,1330.0f,3817.0f,1340.0f,3825.0f,1255.0f);
        path.curveTo(3834.0f,1166.0f,3820.0f,1079.0f,3786.0f,1004.0f);
        path.curveTo(3761.0f,951.0f,3690.0f,865.0f,3638.0f,829.0f);
        path.lineTo(3611.0f,809.0f);
        path.lineTo(3494.0f,854.0f);
        path.curveTo(3430.0f,879.0f,3376.0f,901.0f,3373.0f,904.0f);
        path.curveTo(3370.0f,906.0f,3378.0f,922.0f,3390.0f,938.0f);
        path.curveTo(3402.0f,954.0f,3416.0f,990.0f,3421.0f,1016.0f);
        path.curveTo(3426.0f,1043.0f,3435.0f,1067.0f,3441.0f,1068.0f);
        path.curveTo(3446.0f,1070.0f,3464.0f,1083.0f,3480.0f,1096.0f);
        path.curveTo(3518.0f,1129.0f,3535.0f,1181.0f,3521.0f,1221.0f);
        path.curveTo(3511.0f,1249.0f,3513.0f,1255.0f,3540.0f,1280.0f);
        path.curveTo(3575.0f,1313.0f,3581.0f,1370.0f,3554.0f,1409.0f);
        path.curveTo(3540.0f,1428.0f,3540.0f,1436.0f,3550.0f,1456.0f);
        path.curveTo(3558.0f,1469.0f,3567.0f,1480.0f,3571.0f,1480.0f);
        path.curveTo(3575.0f,1480.0f,3621.0f,1455.0f,3672.0f,1424.0f);
        g2.setColor(Color.decode("#fde151"));
        g2.fill(path);
        g2.draw(path);

        path.reset();
        path.moveTo(4082.0f,1312.0f);
        path.curveTo(4090.0f,1305.0f,4106.0f,1263.0f,4116.0f,1217.0f);
        path.curveTo(4145.0f,1093.0f,4142.0f,778.0f,4112.0f,665.0f);
        path.curveTo(4082.0f,555.0f,4029.0f,451.0f,3968.0f,385.0f);
        path.curveTo(3892.0f,302.0f,3894.0f,302.0f,3826.0f,377.0f);
        path.lineTo(3767.0f,441.0f);
        path.lineTo(3791.0f,466.0f);
        path.curveTo(3804.0f,480.0f,3841.0f,508.0f,3872.0f,527.0f);
        path.curveTo(3903.0f,546.0f,3931.0f,568.0f,3934.0f,576.0f);
        path.curveTo(3942.0f,597.0f,3929.0f,651.0f,3915.0f,657.0f);
        path.curveTo(3895.0f,664.0f,3809.0f,616.0f,3752.0f,565.0f);
        path.curveTo(3724.0f,540.0f,3696.0f,521.0f,3692.0f,524.0f);
        path.curveTo(3687.0f,527.0f,3680.0f,551.0f,3677.0f,577.0f);
        path.curveTo(3674.0f,603.0f,3660.0f,663.0f,3646.0f,710.0f);
        path.curveTo(3623.0f,788.0f,3623.0f,796.0f,3638.0f,804.0f);
        path.curveTo(3647.0f,810.0f,3678.0f,836.0f,3707.0f,862.0f);
        path.curveTo(3805.0f,956.0f,3861.0f,1113.0f,3845.0f,1253.0f);
        path.curveTo(3840.0f,1298.0f,3842.0f,1315.0f,3852.0f,1322.0f);
        path.curveTo(3871.0f,1335.0f,4064.0f,1327.0f,4082.0f,1312.0f);
        g2.setColor(Color.decode("#fbffff"));
        g2.fill(path);
        g2.draw(path);

        path.reset();
        path.moveTo(4168.0f,1263.0f);
        path.curveTo(4194.0f,1196.0f,4202.0f,1146.0f,4207.0f,1009.0f);
        path.curveTo(4219.0f,697.0f,4132.0f,427.0f,3972.0f,276.0f);
        path.curveTo(3946.0f,252.0f,3938.0f,249.0f,3925.0f,260.0f);
        path.curveTo(3901.0f,280.0f,3906.0f,292.0f,3961.0f,345.0f);
        path.curveTo(4147.0f,528.0f,4203.0f,845.0f,4124.0f,1274.0f);
        path.curveTo(4117.0f,1310.0f,4118.0f,1312.0f,4137.0f,1302.0f);
        path.curveTo(4148.0f,1296.0f,4162.0f,1278.0f,4168.0f,1263.0f);
        g2.setColor(Color.decode("#fbd8d4"));

        g2.fill(path);
        g2.draw(path);

        path.reset();
        path.moveTo(3139.0f,1004.0f);
        path.lineTo(3177.0f,989.0f);
        path.lineTo(3163.0f,940.0f);
        path.curveTo(3146.0f,883.0f,3157.0f,850.0f,3193.0f,850.0f);
        path.curveTo(3216.0f,850.0f,3257.0f,874.0f,3275.0f,898.0f);
        path.curveTo(3286.0f,912.0f,3310.0f,905.0f,3503.0f,828.0f);
        path.lineTo(3580.0f,797.0f);
        path.lineTo(3580.0f,710.0f);
        path.curveTo(3580.0f,652.0f,3576.0f,619.0f,3568.0f,612.0f);
        path.curveTo(3523.0f,576.0f,3290.0f,565.0f,3182.0f,594.0f);
        path.curveTo(3110.0f,613.0f,3016.0f,655.0f,2999.0f,676.0f);
        path.curveTo(2991.0f,686.0f,2997.0f,726.0f,3024.0f,842.0f);
        path.curveTo(3044.0f,926.0f,3063.0f,1001.0f,3065.0f,1008.0f);
        path.curveTo(3071.0f,1024.0f,3091.0f,1023.0f,3139.0f,1004.0f);
        g2.setColor(Color.decode("#fde151"));
        g2.fill(path);
        g2.draw(path);

        path.reset();
        path.moveTo(3054.0f,621.0f);
        path.curveTo(3087.0f,605.0f,3144.0f,584.0f,3180.0f,574.0f);
        path.curveTo(3266.0f,552.0f,3433.0f,551.0f,3518.0f,574.0f);
        path.curveTo(3577.0f,590.0f,3582.0f,590.0f,3605.0f,573.0f);
        path.curveTo(3642.0f,546.0f,3635.0f,536.0f,3572.0f,523.0f);
        path.curveTo(3540.0f,517.0f,3492.0f,503.0f,3467.0f,492.0f);
        path.curveTo(3413.0f,468.0f,3407.0f,446.0f,3443.0f,405.0f);
        path.lineTo(3465.0f,379.0f);
        path.lineTo(3560.0f,410.0f);
        path.curveTo(3657.0f,443.0f,3740.0f,453.0f,3747.0f,434.0f);
        path.curveTo(3749.0f,428.0f,3717.0f,414.0f,3673.0f,402.0f);
        path.curveTo(3580.0f,378.0f,3500.0f,344.0f,3500.0f,331.0f);
        path.curveTo(3500.0f,326.0f,3510.0f,310.0f,3523.0f,296.0f);
        path.lineTo(3545.0f,271.0f);
        path.lineTo(3650.0f,306.0f);
        path.curveTo(3708.0f,326.0f,3773.0f,342.0f,3794.0f,343.0f);
        path.curveTo(3830.0f,345.0f,3837.0f,341.0f,3872.0f,295.0f);
        path.curveTo(3923.0f,229.0f,3944.0f,190.0f,3933.0f,179.0f);
        path.curveTo(3928.0f,174.0f,3881.0f,160.0f,3829.0f,148.0f);
        path.curveTo(3688.0f,115.0f,3417.0f,116.0f,3270.0f,148.0f);
        path.curveTo(3087.0f,189.0f,2898.0f,272.0f,2906.0f,307.0f);
        path.curveTo(2908.0f,317.0f,2921.0f,381.0f,2935.0f,450.0f);
        path.curveTo(2968.0f,605.0f,2979.0f,650.0f,2986.0f,650.0f);
        path.curveTo(2990.0f,650.0f,3020.0f,637.0f,3054.0f,621.0f);
        g2.setColor(Color.decode("#fbffff"));
        g2.fill(path);
        g2.draw(path);

        path.reset();
        path.moveTo(3686.0f,499.0f);
        path.curveTo(3702.0f,482.0f,3702.0f,477.0f,3690.0f,470.0f);
        path.curveTo(3682.0f,464.0f,3670.0f,460.0f,3663.0f,460.0f);
        path.curveTo(3657.0f,460.0f,3610.0f,446.0f,3559.0f,430.0f);
        path.curveTo(3471.0f,401.0f,3465.0f,400.0f,3453.0f,416.0f);
        path.curveTo(3432.0f,445.0f,3438.0f,460.0f,3478.0f,477.0f);
        path.curveTo(3517.0f,494.0f,3611.0f,517.0f,3646.0f,519.0f);
        path.curveTo(3657.0f,520.0f,3675.0f,511.0f,3686.0f,499.0f);
        g2.setColor(Color.decode("#ffffff"));
        g2.fill(path);
        g2.draw(path);

        path.reset();
        path.moveTo(2991.0f,221.0f);
        path.curveTo(3096.0f,172.0f,3225.0f,134.0f,3355.0f,113.0f);
        path.curveTo(3471.0f,96.0f,3704.0f,101.0f,3810.0f,124.0f);
        path.curveTo(3846.0f,132.0f,3890.0f,141.0f,3908.0f,145.0f);
        path.curveTo(3934.0f,151.0f,3940.0f,149.0f,3940.0f,136.0f);
        path.curveTo(3940.0f,72.0f,3631.0f,39.0f,3369.0f,76.0f);
        path.curveTo(3148.0f,106.0f,2917.0f,180.0f,2900.0f,224.0f);
        path.curveTo(2893.0f,242.0f,2895.0f,260.0f,2904.0f,260.0f);
        path.curveTo(2906.0f,260.0f,2945.0f,242.0f,2991.0f,221.0f);
        g2.setColor(Color.decode("#fbd8d4"));
        g2.fill(path);
        g2.draw(path);



        path.reset();
        path.moveTo(3552.0f,6122.0f);
        path.curveTo(3496.0f,6101.0f,3424.0f,6045.0f,3388.0f,5995.0f);
        path.curveTo(3346.0f,5936.0f,3324.0f,5817.0f,3338.0f,5728.0f);
        path.curveTo(3350.0f,5647.0f,3381.0f,5578.0f,3413.0f,5561.0f);
        path.curveTo(3431.0f,5551.0f,3455.0f,5552.0f,3534.0f,5565.0f);
        path.curveTo(3653.0f,5584.0f,3757.0f,5617.0f,3867.0f,5672.0f);
        path.curveTo(3988.0f,5732.0f,3993.0f,5738.0f,3988.0f,5824.0f);
        path.curveTo(3982.0f,5916.0f,3954.0f,5977.0f,3888.0f,6044.0f);
        path.curveTo(3798.0f,6133.0f,3663.0f,6165.0f,3552.0f,6122.0f);
        g2.setColor(Color.decode("#b15f13"));
        g2.fill(path);
        g2.draw(path);



        path.reset();


        path.moveTo(3788.0f,6081.0f);
        path.curveTo(3885.0f,6032.0f,3944.0f,5954.0f,3960.0f,5857.0f);
        path.curveTo(3973.0f,5778.0f,3964.0f,5754.0f,3915.0f,5725.0f);
        path.curveTo(3857.0f,5691.0f,3848.0f,5693.0f,3866.0f,5735.0f);
        path.curveTo(3897.0f,5811.0f,3875.0f,5920.0f,3814.0f,5982.0f);
        path.curveTo(3708.0f,6092.0f,3527.0f,6086.0f,3427.0f,5970.0f);
        path.curveTo(3379.0f,5914.0f,3379.0f,5932.0f,3426.0f,5993.0f);
        path.curveTo(3452.0f,6026.0f,3484.0f,6051.0f,3534.0f,6076.0f);
        path.curveTo(3600.0f,6109.0f,3610.0f,6111.0f,3675.0f,6107.0f);
        path.curveTo(3720.0f,6105.0f,3760.0f,6095.0f,3788.0f,6081.0f);
        g2.setColor(Color.decode("#fcffff"));
        // g2.setColor(Color.black);
        g2.fill(path);
        g2.draw(path);


        g2.setColor(Color.black);
        int radius = 120;  // radius of the circle
        g2.fillOval(3500, 5700, radius * 2, radius * 2);

        g2.setColor(Color.WHITE);
        int radius2 = 50;  // radius of the circle
        g2.fillOval(3600, 5850, radius2 * 2, radius2 * 2);

        path.reset();
        path.moveTo(2231.0f,5690.0f);
        path.curveTo(2095.0f,5640.0f,2026.0f,5556.0f,2004.0f,5415.0f);
        path.curveTo(1992.0f,5335.0f,2030.0f,5210.0f,2083.0f,5153.0f);
        path.curveTo(2099.0f,5135.0f,2114.0f,5130.0f,2155.0f,5130.0f);
        path.curveTo(2299.0f,5130.0f,2494.0f,5188.0f,2629.0f,5271.0f);
        path.curveTo(2726.0f,5331.0f,2736.0f,5345.0f,2720.0f,5409.0f);
        path.curveTo(2693.0f,5515.0f,2599.0f,5630.0f,2500.0f,5677.0f);
        path.curveTo(2424.0f,5713.0f,2308.0f,5719.0f,2231.0f,5690.0f);
        g2.setColor(Color.decode("#b15f13"));
        g2.fill(path);
        g2.draw(path);





        path.reset();

        path.moveTo(2501.0f,5646.0f);
        path.curveTo(2571.0f,5613.0f,2632.0f,5549.0f,2671.0f,5467.0f);
        path.curveTo(2712.0f,5381.0f,2710.0f,5357.0f,2658.0f,5320.0f);
        path.curveTo(2607.0f,5283.0f,2597.0f,5282.0f,2607.0f,5318.0f);
        path.curveTo(2621.0f,5366.0f,2615.0f,5463.0f,2596.0f,5500.0f);
        path.curveTo(2571.0f,5549.0f,2522.0f,5598.0f,2475.0f,5623.0f);
        path.curveTo(2417.0f,5653.0f,2291.0f,5653.0f,2234.0f,5623.0f);
        path.curveTo(2133.0f,5569.0f,2084.0f,5483.0f,2093.0f,5374.0f);
        path.curveTo(2099.0f,5298.0f,2137.0f,5231.0f,2199.0f,5190.0f);
        path.lineTo(2235.0f,5166.0f);
        path.lineTo(2192.0f,5156.0f);
        path.curveTo(2127.0f,5142.0f,2100.0f,5156.0f,2065.0f,5220.0f);
        path.curveTo(2038.0f,5270.0f,2035.0f,5283.0f,2035.0f,5370.0f);
        path.curveTo(2035.0f,5448.0f,2039.0f,5472.0f,2057.0f,5506.0f);
        path.curveTo(2136.0f,5655.0f,2345.0f,5721.0f,2501.0f,5646.0f);
        g2.setColor(Color.decode("#fcffff"));
        g2.fill(path);
        g2.draw(path);

        path.reset();
        path.moveTo(3462.0f,5056.0f);
        path.curveTo(3456.0f,5042.0f,3427.0f,5012.0f,3398.0f,4989.0f);
        path.curveTo(3274.0f,4891.0f,3070.0f,4835.0f,2929.0f,4860.0f);
        path.curveTo(2850.0f,4874.0f,2809.0f,4895.0f,2816.0f,4915.0f);
        path.curveTo(2824.0f,4935.0f,2801.0f,4934.0f,2772.0f,4914.0f);
        path.curveTo(2751.0f,4899.0f,2743.0f,4870.0f,2757.0f,4857.0f);
        path.curveTo(2760.0f,4853.0f,2768.0f,4858.0f,2775.0f,4866.0f);
        path.curveTo(2785.0f,4880.0f,2790.0f,4881.0f,2810.0f,4870.0f);
        path.curveTo(2975.0f,4782.0f,3303.0f,4846.0f,3434.0f,4991.0f);
        path.curveTo(3459.0f,5019.0f,3480.0f,5051.0f,3480.0f,5061.0f);
        path.curveTo(3480.0f,5086.0f,3475.0f,5085.0f,3462.0f,5056.0f);
        g2.setColor(Color.decode("#b5600f"));
        g2.fill(path);
        g2.draw(path);

        g2.setColor(Color.black);
        int radius3 = 120;  // radius of the circle
        g2.fillOval(2250, 5250, radius3 * 2, radius3 * 2);

        g2.setColor(Color.WHITE);
        int radius4 = 50;  // radius of the circle
        g2.fillOval(2350, 5350, radius4 * 2, radius4 * 2);

        path.reset();
        path.moveTo(3769.0f,818.0f);
        path.curveTo(3724.0f,783.0f,3683.0f,748.0f,3677.0f,739.0f);
        path.curveTo(3665.0f,720.0f,3675.0f,661.0f,3695.0f,634.0f);
        path.curveTo(3711.0f,612.0f,3705.0f,608.0f,3830.0f,709.0f);
        path.curveTo(3912.0f,776.0f,3921.0f,786.0f,3915.0f,809.0f);
        path.curveTo(3906.0f,846.0f,3882.0f,880.0f,3865.0f,880.0f);
        path.curveTo(3857.0f,880.0f,3814.0f,852.0f,3769.0f,818.0f);
        g2.setColor(Color.decode("#fffffd"));
        g2.fill(path);
        g2.draw(path);

        path.moveTo(3878.0f,848.0f);
        path.curveTo(3910.0f,807.0f,3903.0f,795.0f,3809.0f,719.0f);
        path.curveTo(3759.0f,678.0f,3715.0f,645.0f,3711.0f,645.0f);
        path.curveTo(3708.0f,645.0f,3701.0f,662.0f,3696.0f,682.0f);
        path.curveTo(3685.0f,727.0f,3693.0f,738.0f,3789.0f,811.0f);
        path.curveTo(3859.0f,864.0f,3863.0f,866.0f,3878.0f,848.0f);
        g2.setColor(Color.decode("#fffffd"));
        g2.fill(path);
        g2.draw(path);

        int radius5 = 45;
        g2.setColor(Color.yellow);
        g2.fillOval(3600, 3500, radius5 * 2, radius5 * 2);

        g2.setColor(Color.yellow);
        g2.fillOval(3550, 3600, radius5 * 2, radius5 * 2);

        g2.setColor(Color.yellow);
        g2.fillOval(3500, 3700, radius5 * 2, radius5 * 2);

        g2.setColor(Color.white);
        g2.fillOval(3450, 3800, radius5 * 2, radius5 * 2);

        g2.setColor(Color.decode("#46add6"));
        g2.fillOval(3400, 3850, radius5 * 2, radius5 * 2);

        g2.setColor(Color.decode("#46add6"));
        g2.fillOval(3500, 3850, radius5 * 2, radius5 * 2);

        g2.setColor(Color.decode("#46add6"));
        g2.fillOval(3380, 3750, radius5 * 2, radius5 * 2);



        g2.setColor(Color.yellow);
        g2.fillOval(3200, 3750, radius5 * 2, radius5 * 2);

        g2.setColor(Color.yellow);
        g2.fillOval(3300, 3750, radius5 * 2, radius5 * 2);




    }

    private static void resetTransform() {
        m.setToIdentity();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g, getWidth(), getHeight(),0,0);
    }


}
