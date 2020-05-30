# react-native-auto-picker

- 선언 <br>
import DatePicker from 'react-native-auto-picker'; <br> <br>
- 사용 <br> <br>
this.state={ <br>
    date : null <br>
}; <br> <br>
<DatePicker locale="ko-KR" mode="date" date={new Date()} onDateChange={this.state.date}/> <br>