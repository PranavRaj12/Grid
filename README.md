# Grid
Custom library to get the network connectivity status of your app

### Gradle

Add to project level _build.gradle_

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

and

```
dependencies {
	        implementation 'com.github.PranavRaj12:Grid:0.1.0'
	}
```


### Screenshots:
Connected to WiFi

<br>
<img height="600" src="https://github.com/PranavRaj12/Grid/blob/master/Connected.png"/>
<br>

Flight mode ON 	:airplane:

<br>
<img height="600" src="https://github.com/PranavRaj12/Grid/blob/master/Not%20connected.png"/>
<br>



### Usage

```
  val status = findViewById<MaterialTextView>(R.id.statusText) as MaterialTextView

        val connectionStatus = ConnectionStatus()
        if (!connectionStatus.isConnected(this)){
            status.setText("Network Error!")
        }
        else{
            status.setText("Connected.")
        }
```

#### More features coming soon. :innocent:
