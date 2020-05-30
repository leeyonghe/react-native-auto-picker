# react-native-auto-picker
- 미리보기 <br>
![alt text]("ScreenShot/screenshot.png") <br> <br>
- 선언 <br>
import DatePicker from 'react-native-auto-picker'; <br> <br>
- 사용 <br> <br>
this.state={ <br>
    date : null <br>
}; <br> <br>
<DatePicker locale="ko-KR" mode="date" date={new Date()} onDateChange={this.state.date}/> <br>
