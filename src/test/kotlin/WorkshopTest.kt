import org.example.celsiusToFahrenheit
import org.example.kilometersToMiles
import org.example.Product
import org.example.calculateTotalElectronicsPriceOver500
import org.example.countElectronicsOver500
import org.example.products



import kotlin.test.Test
import kotlin.test.assertEquals

class WorkshopTest {

    // --- Tests for Workshop #1: Unit Converter ---

    // celsius input: 20.0
    // expected output: 68.0
    @Test
    fun `test celsiusToFahrenheit with positive value`() {
        // Arrange: ตั้งค่า input และผลลัพธ์ที่คาดหวัง
        val celsiusInput = 20.0
        val expectedFahrenheit = 68.0

        // Act: เรียกใช้ฟังก์ชันที่ต้องการทดสอบ
        val actualFahrenheit = celsiusToFahrenheit(celsiusInput)

        // Assert: ตรวจสอบว่าผลลัพธ์ที่ได้ตรงกับที่คาดหวัง
        assertEquals(expectedFahrenheit, actualFahrenheit, 0.001, "20°C should be 68°F")
    }

    // celsius input: 0.0
    // expected output: 32.0
    @Test
    fun `test celsiusToFahrenheit with zero`() {
        // Arrange
        val celsiusInput = 0.0
        val expectedFahrenheit = 32.0

        // Act
        val actualFahrenheit = celsiusToFahrenheit(celsiusInput)

        // Assert
        assertEquals(expectedFahrenheit, actualFahrenheit, 0.001, "0°C should be 32°F")
    }

    // celsius input: -10.0
    // expected output: 14.0
    @Test
    fun `test celsiusToFahrenheit with negative value`() {
        // Arrange
        val celsiusInput = -10.0
        val expectedFahrenheit = 14.0

        // Act
        val actualFahrenheit = celsiusToFahrenheit(celsiusInput)

        // Assert
        assertEquals(expectedFahrenheit, actualFahrenheit, 0.001, "-10°C should be 14°F")
    }

    // test for kilometersToMiles function
    // kilometers input: 1.0
    // expected output: 0.621371
    @Test
    fun `test kilometersToMiles with one kilometer`() {
        // Arrange
        val kilometersInput  = 1.0
        val expectedMiles = 0.621371

        // Act
        val actualMiles = kilometersToMiles(kilometersInput)

        // Assert
        assertEquals(expectedMiles, actualMiles, 0.001, "1 km should be approximately 0.621371 miles")
    }

    // --- Tests for Workshop #1: Unit Converter End ---

    // --- Tests for Workshop #2: Data Analysis Pipeline ---
    // ทำการแก้ไขไฟล์ Workshop2.kt ให้มีฟังก์ชันที่ต้องการทดสอบ
    // เช่น ฟังก์ชันที่คำนวณผลรวมราคาสินค้า Electronics ที่ราคา > 500 บาท
    // ในที่นี้จะสมมุติว่ามีฟังก์ชันชื่อ calculateTotalElectronicsPriceOver500 ที่รับ List<Product> และคืนค่า Double
    // จงเขียน test cases สำหรับฟังก์ชันนี้ โดยตรวจสอบผลรวมราคาสินค้า Electronics ที่ราคา > 500 บาท
    // 🚨

    @Test
    fun testCalculateTotalElectronicsPriceOver500() {

        val totalElecPriceOver500 = 35000.0 + 25000.0 + 7500.0 + 1800.0 // = 69300.0
        val actualSum = calculateTotalElectronicsPriceOver500(products= products)
        assertEquals(totalElecPriceOver500, actualSum, "ผลรวมราคาสินค้า Electronics ที่ราคา > 500 บาท ต้องถูกต้อง")
    }

    // จงเขียน test cases เช็คจำนวนสินค้าที่อยู่ในหมวด 'Electronics' และมีราคามากกว่า 500 บาท
    // 🚨

    @Test
    fun testCountElectronicsOver500() {

        val expectedCount = 4 // Laptop, Smartphone, Monitor, Headphones
        val actualCount = countElectronicsOver500(products=products)
        assertEquals(expectedCount, actualCount, "จำนวนสินค้าหมวด Electronics ที่ราคา > 500 บาท ต้องถูกต้อง")
    }

    // --- Tests for Workshop #2: Data Analysis Pipeline End ---
}
