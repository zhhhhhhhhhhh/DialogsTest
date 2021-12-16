package pack;

public class Newclass {
    /**
     * Measures, how long Javacord will need to perform a single REST call.
     *
     * <p>This method does not measure the "true" latency to Discord's REST endpoints because the request is handled by
     * Javacord like any other request, including rate-limit handling. This causes some small delays that negatively
     * affects the latency. However, this provides a somewhat realistic measurement on how long a typical REST call of
     * Javacord will need. The latency is influenced by many non-network related factors like your system's current
     * workload.
     *
     * <p>This method uses the {@code GET /users/@me} endpoint to test the latency.
     * The method ensures that only one ping measurement is performed at once by the same {@code DiscordApi} instance.
     *
     * <p><b>Warning</b>: This method does not bypass the global ratelimit check.
     * If your bot gets ratelimited globally, the latency will appear higher that it really is!
     *
     * <p><b>Expected latency</b>: Usually, you can expect a latency between {@code 50 ms} and {@code 500 ms} with a
     * good internet connection. This value may vary, depending on your location, time of day, Discord's status, and the
     * current workload of your system. A value above {@code 1000 ms} is usually an indicator that something is wrong.
     * It is recommended to perform multiple tests and calculate an average value.
     *
     * @return The measured latency.
     */
    public static void main(String[] args){

        System.out.println("ethrth");

    }
}
