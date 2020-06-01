require 'json'

package = JSON.parse(File.read(File.join(__dir__, 'package.json')))

Pod::Spec.new do |s|
  s.name         = "react-native-date-picker"
  s.version      = package['version']
  s.summary      = "React Native Date Picker component for Android and iOS"

  s.authors      = { "lee" => "henning.hall@hotmail.com" }
  s.homepage     = "https://github.com/lee/react-native-date-picker"
  s.license      = package['license']
  s.platform     = :ios, "8.0"

  s.source       = { :git => "https://github.com/lee/react-native-date-picker.git" }
  s.source_files  = "ios/RNDatePicker/*.{h,m}"

  s.dependency 'React'
end