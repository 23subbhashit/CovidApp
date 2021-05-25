package www.bmsit.loginatuh;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
public interface APIInterface {
    @GET("everything")
    Call<ResponseModel> getLatestNews(@Query("q") String source,@Query("sortBy") String sortBy,@Query("apiKey") String apiKey);
}
