package flipped.flipped;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.vidyo.VidyoClient.Connector.Connector;
import com.vidyo.VidyoClient.Connector.VidyoConnector;
import com.vidyo.VidyoClient.Connector.VidyoGateway;
public class Call extends AppCompatActivity implements VidyoConnector.IConnect {

    private VidyoConnector vc;
    private FrameLayout videoFrame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        Connector.SetApplicationUIContext(this);
        Connector.Initialize();
        videoFrame = findViewById(R.id.videoFrame1);
    }

    public void Start(View v) {
        vc = new VidyoConnector(videoFrame, VidyoConnector.VidyoConnectorViewStyle.VIDYO_CONNECTORVIEWSTYLE_Default, 16, "", "", 0);
        vc.ShowViewAt(videoFrame, 0, 0, videoFrame.getWidth(), videoFrame.getHeight());
    }

    public void Connect(View v) {
       String  token = "cHJvdmlzaW9uAGRlbW9Vc2VyMDc4MEA3Zjc2NjcudmlkeW8uaW8ANjM3MDUwNjY1OTMAADliNThmODA5ZDk4YTFiNTFjMmMwY2M0NWI0MzcxZDUyZDFiNzc5ZjFkY2IzYmE3YzNkOWU0ZTRjMTFjNDI5MjA3YjAwYjkwYTI4Y2QxYzU0NjkxMDUwOTQwMTNmOWQ1Ng==";
        vc.Connect("prod.vidyo.io", token, "user99581", "demoroom", (VidyoConnector.IConnect) this);
    }

    public void Disconnect(View v) {
        vc.Disconnect();
    }


    public void OnSuccess() {

    }

    public void OnFailure(VidyoConnector.VidyoConnectorFailReason vidyoConnectorFailReason) {

    }

    public void OnDisconnected(VidyoConnector.VidyoConnectorDisconnectReason vidyoConnectorDisconnectReason) {

    }
}
