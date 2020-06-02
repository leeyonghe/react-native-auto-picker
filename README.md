# react-native-auto-picker

- 미리보기 <br>
![alt text](./ScreenShot/screenshot.png) <br> <br>

- 미리설치해야할 모듈 <br>
```
npm install --save moment
```

- 선언 <br>
```
import DatePicker from 'react-native-auto-picker';
```
- 사용 <br> <br>
```
this.state={
    date : null
};

<DatePicker locale="ko-KR" mode="date" date={new Date()} onDateChange={this.state.date}/>
```
