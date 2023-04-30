package ua.lviv.iot;

public class Main {
    public static void main(String[] args) {
        Words words = new Words();
        words.deleteVowelsGraterConsonants("The Internet of Things, or IoT, refers to the network of physical devices, vehicles, home appliances, and other items that are embedded with sensors, software, and connectivity, allowing them to collect and exchange data. The concept of IoT is based on the idea of making everyday objects smart and connected, enabling them to communicate with each other and with users, and ultimately providing more efficient and convenient ways of living and working.\n" +
                "\n" +
                "IoT technology is already transforming many industries, from healthcare and transportation to manufacturing and agriculture. For example, in healthcare, IoT devices can monitor patients' vital signs and send real-time data to doctors and nurses, enabling faster and more accurate diagnoses and treatment. In transportation, IoT-enabled sensors and cameras can track traffic flow and help optimize routes, reducing congestion and improving safety. In manufacturing, IoT sensors can monitor equipment performance and predict maintenance needs, minimizing downtime and reducing costs.\n" +
                "\n" +
                "However, as with any technology, there are also potential risks and challenges associated with IoT. One of the biggest concerns is security, as IoT devices can be vulnerable to cyberattacks and data breaches. Another challenge is the sheer scale of IoT networks and the amount of data they generate, which can create issues with data storage, processing, and analysis.\n" +
                "\n" +
                "Despite these challenges, the potential benefits of IoT are vast, and the technology is expected to continue to grow and evolve in the coming years. As more devices become connected and more data is generated, new opportunities for innovation and optimization will emerge, transforming the way we live and work in ways we can't yet imagine.");
        }
    }
