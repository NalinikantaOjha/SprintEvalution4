import com.example.sprint4evalution.ResponseModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

@GET("/v1")
    Call<List<ResponseModel>>getcountry(@Query("countryicode")String code);

}
