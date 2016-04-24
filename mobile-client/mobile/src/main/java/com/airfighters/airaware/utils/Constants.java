package com.airfighters.airaware.utils;

/**
 * Created by alex on 23.04.2016.
 */
public interface Constants {
    int MARKER_CLICK_ZOOM_LEVEL = 7;
    float CITY_APPROXIMATION = 0.5f;

    String DISEASES_JSON = "{\n" +
            "  \"diseases\": [\n" +
            "     {\n" +
            "       \"name\" : \"Asthma\",\n" +
            "       \"symptom\" : \"Asthma is a lung condition that makes it hard to breathe, an asthma attack can be life threatening. For children causes swelling and narrowing in the airways, causing cough.\",\n" +
            "       \"color\" : \"#9C27B0\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Common cold\",\n" +
            "       \"symptom\" : \"The common cold is a viral respiratory infection causing sore throat, stuffy or runny nose, headache and more.\",\n" +
            "       \"color\" : \"#F44336\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Bronchitis\",\n" +
            "       \"symptom\" : \"Bronchitis, an inflammation of the bronchial tubes, causes cough, dark or yellow mucus, chest pain and more.\",\n" +
            "       \"color\" : \"#FFC107\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Allergic reaction\",\n" +
            "       \"symptom\" : \"Allergic reaction causes sneezing, runny nose and hives and can lead to anaphylaxis, a whole body reaction.\",\n" +
            "       \"color\" : \"#F44336\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Indoor allergens\",\n" +
            "       \"symptom\" : \"Indoor allergens are the things that cause an allergic reaction: dust, dust mites, mold, pet hair and more.\",\n" +
            "       \"color\" : \"#F44336\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Hay fever\",\n" +
            "       \"symptom\" : \"Hay fever, an allergic reaction to outdoor pollens and molds, causes nasal congestion, itchy eyes, and more.\",\n" +
            "       \"color\" : \"#9C27B0\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Acute sinusitis\",\n" +
            "       \"symptom\" : \"Acute sinusitis, an inflammation of the sinuses, causes sinus pain and tenderness, facial redness and more.\",\n" +
            "       \"color\" : \"#00BCD4\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Chronic obstructive pulmonary disease (COPD)\",\n" +
            "       \"symptom\" : \"COPD is a chronic lung disease that makes breathing difficult.\",\n" +
            "       \"color\" : \"#9C27B0\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Heartburn/GERD\",\n" +
            "       \"symptom\" : \"Symptoms of heartburn and GERD are a burning feeling in the chest, throat, or mouth, nausea, and more.\",\n" +
            "       \"color\" : \"#2196F3\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Dust exposure\",\n" +
            "       \"symptom\" : \"Dust exposure can cause congestion, runny nose, cough, shortness of breath, tightness in the chest, and more.\",\n" +
            "       \"color\" : \"#009688\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Small cell lung cancer\",\n" +
            "       \"symptom\" : \"Small cell lung cancer is the least common type of lung cancer and can cause a cough, chest pain, and more.\",\n" +
            "       \"color\" : \"#FFC107\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Asbestosis\",\n" +
            "       \"symptom\" : \"Asbestosis is a serious lung disease, causing shortness of breath, dry cough, chest tightness and more.\",\n" +
            "       \"color\" : \"#F44336\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Bronchial adenoma\",\n" +
            "       \"symptom\" : \"Bronchial adenomas are cancers of the respiratory tract causing a cough, fever, or shortness of breath.\",\n" +
            "       \"color\" : \"#9C27B0\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Non-small cell lung cancer\",\n" +
            "       \"symptom\" : \"Non-small cell lung cancer is the most common type of lung cancer and can cause a cough, chest pain, and more.\",\n" +
            "       \"color\" : \"#00BCD4\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Emphysema\",\n" +
            "       \"symptom\" : \"Emphysema is a chronic lung condition that causes shortness of breath, a chronic cough, wheezing, and more.\",\n" +
            "       \"color\" : \"#9C27B0\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Pneumonia\",\n" +
            "       \"symptom\" : \"Pneumonia is a lung infection and causes cough, shortness of breath, wheezing, chest pain, fever, and chills.\",\n" +
            "       \"color\" : \"#2196F3\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Nasal congestion\",\n" +
            "       \"symptom\" : \"Nasal congestion is a stuffy nose, and can be accompanied by blocked ears, sore throat, and more.\",\n" +
            "       \"color\" : \"#009688\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Smoke exposure\",\n" +
            "       \"symptom\" : \"Exposure to smoke can cause coughing, wheezing, shortness of breath, chest tightness, chest pain, and more.\",\n" +
            "       \"color\" : \"#FFC107\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Chronic sinusitis\",\n" +
            "       \"symptom\" : \"Chronic sinusitis, or sinus infections, cause a stuffy or runny nose, tooth pain, fever, sore throat and more.\",\n" +
            "       \"color\" : \"#9C27B0\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Chemical pneumonia\",\n" +
            "       \"symptom\" : \"Chemical pneumonia is an irritation of the lungs that can cause a dry cough, headache, chest pain and more.\",\n" +
            "       \"color\" : \"#F44336\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Cryptococcosis\",\n" +
            "       \"symptom\" : \"Cryptococcosis is a lung disease causing a wide range of digestive, respiratory and cardiovascular symptoms.\",\n" +
            "       \"color\" : \"#FFC107\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Histoplasmosis\",\n" +
            "       \"symptom\" : \"Histoplasmosis is a fungal infection of the lungs causing muscle aches, fever, chest pain, cough, and more.\",\n" +
            "       \"color\" : \"#F44336\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Viral pneumonia\",\n" +
            "       \"symptom\" : \"Viral pneumonia is a lung infection caused by viruses, and causes coughing, wheezing, fever, chills, and more.\",\n" +
            "       \"color\" : \"#F44336\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Anaphylactic shock\",\n" +
            "       \"symptom\" : \"Anaphylactic shock is a sudden severe allergic reaction marked by breathing trouble, a tight throat, and more.\",\n" +
            "       \"color\" : \"#9C27B0\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Upper airway obstruction\",\n" +
            "       \"symptom\" : \"Symptoms of upper airway obstruction include difficulty breathing, wheezing, agitation, gasping, and more.\",\n" +
            "       \"color\" : \"#00BCD4\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Bronchiolitis\",\n" +
            "       \"symptom\" : \"Bronchiolitis, a common lung infection in children, causes a runny nose, cough, fever, wheezing and more.\",\n" +
            "       \"color\" : \"#00BCD4\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Nasal polyps\",\n" +
            "       \"symptom\" : \"Nasal polyps, sacs of inflamed tissue in the nasal passages, can cause cold symptoms, snoring, and more.\",\n" +
            "       \"color\" : \"#9C27B0\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Nonallergic rhinitis\",\n" +
            "       \"symptom\" : \"Non-allergic rhinitis causes congestion, sneezing, runny nose, or itchy red eyes for no apparent reason.\",\n" +
            "       \"color\" : \"#2196F3\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Interstitial lung disease\",\n" +
            "       \"symptom\" : \"Interstitial lung disease is a group of lung disorders that cause shortness of breath, a dry cough, and more.\",\n" +
            "       \"color\" : \"#009688\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Croup\",\n" +
            "       \"symptom\" : \"Croup is a childhood viral respiratory infection causing swelling that can make breathing difficult and noisy.\",\n" +
            "       \"color\" : \"#FFC107\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Congestive heart failure\",\n" +
            "       \"symptom\" : \"People with congestive heart failure can have shortness of breath, fatigue, irregular heartbeat and more.\",\n" +
            "       \"color\" : \"#9C27B0\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Exercise-induced asthma\",\n" +
            "       \"symptom\" : \"Exercise-induced asthma causes wheezing, coughing, shortness of breath, and chest tightness.\",\n" +
            "       \"color\" : \"#F44336\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Pneumonitis\",\n" +
            "       \"symptom\" : \"Pneumonitis is any inflammation of the lung and causes trouble breathing, cough, and fever.\",\n" +
            "       \"color\" : \"#00BCD4\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Pulmonary embolism\",\n" +
            "       \"symptom\" : \"A pulmonary embolism, a blood clot lodged in the lung, causes shortness of breath, chest pain, and more.\",\n" +
            "       \"color\" : \"#9C27B0\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Pulmonary fibrosis\",\n" +
            "       \"symptom\" : \"Pulmonary fibrosis is a serious chronic lung condition where the lungs become scarred and stiff.\",\n" +
            "       \"color\" : \"#2196F3\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Thyroid cancer\",\n" +
            "       \"symptom\" : \"Thyroid cancer is cancer of the thyroid gland and can cause a cough, hoarseness, a lump in the neck, and more.\",\n" +
            "       \"color\" : \"#009688\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Tuberculosis\",\n" +
            "       \"symptom\" : \"Tuberculosis usually infects the lungs, causing a bad cough with blood, chest pain, fever, chills, and fatigue.\",\n" +
            "       \"color\" : \"#FFC107\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Whooping cough\",\n" +
            "       \"symptom\" : \"Whooping cough, a contagious respiratory infection, causes a runny nose, a mild fever, and a severe cough.\",\n" +
            "       \"color\" : \"#F44336\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Conjunctivitis\",\n" +
            "       \"symptom\" : \"Conjunctivitis symptoms are: itchy, red, watering eyes\",\n" +
            "       \"color\" : \"#9C27B0\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Hives\",\n" +
            "       \"symptom\" : \"Hives symptoms are:  wheezing, chest tightness, shortness of breath and a cough a raised, itchy, red rash\",\n" +
            "       \"color\" : \"#00BCD4\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"Allergic rhinitis\",\n" +
            "       \"symptom\" : \"Allergic rhinitis causes sneezing and an itchy, runny or blocked nose\",\n" +
            "       \"color\" : \"#9C27B0\"\n" +
            "     },\n" +
            "     {\n" +
            "       \"name\" : \"General Allergy\",\n" +
            "       \"symptom\" : \"When you have an allergic reaction there may be a combination of the following allergy symptoms: sneezing,  wheezing, nasal congestion, coughing, itchy, watery eyes, runny nose, itchy throat, stomach ache,  itchy skin,  hives, fatigue, irritability\",\n" +
            "       \"color\" : \"#2196F3\"\n" +
            "     }\n" +
            "  ]\n" +
            "}";

        String CITIES_JSON = "{\n" +
                "  \"cities\" : [\n" +
                "    {\n" +
                "      \"name\" : \"New York\",\n" +
                "      \"latitude\" : 40.712784,\n" +
                "      \"longitude\" : -74.005941,\n" +
                "      \"population\" : 8491079,\n" +
                "      \"diseases\" : [19, 30, 37]\n" +
                "    },\n" +
                "        {\n" +
                "      \"name\" : \"Los Angeles\",\n" +
                "      \"latitude\" : 34.052234,\n" +
                "      \"longitude\" : -118.243685,\n" +
                "      \"population\" : 3928864,\n" +
                "      \"diseases\" : [18, 14, 16]\n" +
                "    },\n" +
                "        {\n" +
                "      \"name\" : \"Chicago\",\n" +
                "      \"latitude\" : 41.878114,\n" +
                "      \"longitude\" : -87.629798,\n" +
                "      \"population\" : 2722389,\n" +
                "      \"diseases\" : [27, 4, 9]\n" +
                "    },\n" +
                "        {\n" +
                "      \"name\" : \"Houston\",\n" +
                "      \"latitude\" : 29.760427,\n" +
                "      \"longitude\" : -95.369803,\n" +
                "      \"population\" : 2239558,\n" +
                "      \"diseases\" : [23, 40, 31]\n" +
                "    },\n" +
                "        {\n" +
                "      \"name\" : \"Philadelphia\",\n" +
                "      \"latitude\" : 39.952584,\n" +
                "      \"longitude\" : -75.165222,\n" +
                "      \"population\" : 1560297,\n" +
                "      \"diseases\" : [15, 41, 39]\n" +
                "    },\n" +
                "        {\n" +
                "      \"name\" : \"Phoenix\",\n" +
                "      \"latitude\" : 33.448377,\n" +
                "      \"longitude\" : -112.074037,\n" +
                "      \"population\" : 1537058,\n" +
                "      \"diseases\" : [4, 33, 12]\n" +
                "    },\n" +
                "        {\n" +
                "      \"name\" : \"San Antonio\",\n" +
                "      \"latitude\" : 29.424122,\n" +
                "      \"longitude\" : -98.493628,\n" +
                "      \"population\" : 1436697,\n" +
                "      \"diseases\" : [13, 10, 28]\n" +
                "    },\n" +
                "        {\n" +
                "      \"name\" : \"San Diego\",\n" +
                "      \"latitude\" : 32.715738,\n" +
                "      \"longitude\" : -117.161084,\n" +
                "      \"population\" : 1381069,\n" +
                "      \"diseases\" : [25, 13, 41]\n" +
                "    },\n" +
                "        {\n" +
                "      \"name\" : \"Dallas\",\n" +
                "      \"latitude\" : 32.776664,\n" +
                "      \"longitude\" : -96.796988,\n" +
                "      \"population\" : 1281047,\n" +
                "      \"diseases\" : [13, 35, 31]\n" +
                "    },\n" +
                "        {\n" +
                "      \"name\" : \"San Jose\",\n" +
                "      \"latitude\" : 37.338208,\n" +
                "      \"longitude\" : -121.886329,\n" +
                "      \"population\" : 1015785,\n" +
                "      \"diseases\" : [26, 6, 41]\n" +
                "    },\n" +
                "        {\n" +
                "      \"name\" : \"Austin\",\n" +
                "      \"latitude\" : 30.267153,\n" +
                "      \"longitude\" : -97.743061,\n" +
                "      \"population\" : 912791,\n" +
                "      \"diseases\" : [1, 24, 16]\n" +
                "    },\n" +
                "        {\n" +
                "      \"name\" : \"Jacksonville\",\n" +
                "      \"latitude\" : 30.332184,\n" +
                "      \"longitude\" : -81.655651,\n" +
                "      \"population\" : 853382,\n" +
                "      \"diseases\" : [11, 14, 9]\n" +
                "    },\n" +
                "        {\n" +
                "      \"name\" : \"San Francisco\",\n" +
                "      \"latitude\" : 37.774929,\n" +
                "      \"longitude\" : -122.419416,\n" +
                "      \"population\" : 852469,\n" +
                "      \"diseases\" : [6, 38, 34]\n" +
                "    },\n" +
                "        {\n" +
                "      \"name\" : \"Indianapolis\",\n" +
                "      \"latitude\" : 39.768403,\n" +
                "      \"longitude\" : -86.158068,\n" +
                "      \"population\" : 848788,\n" +
                "      \"diseases\" : [13, 16, 17]\n" +
                "    },\n" +
                "        {\n" +
                "      \"name\" : \"Columbus\",\n" +
                "      \"latitude\" : 39.961176,\n" +
                "      \"longitude\" : -82.998794,\n" +
                "      \"population\" : 835957,\n" +
                "      \"diseases\" : [20, 37, 16]\n" +
                "    },\n" +
                "        {\n" +
                "      \"name\" : \"Fort Worth\",\n" +
                "      \"latitude\" : 32.755488,\n" +
                "      \"longitude\" : -97.330766,\n" +
                "      \"population\" : 8491079,\n" +
                "      \"diseases\" : [15, 5, 27]\n" +
                "    },\n" +
                "        {\n" +
                "      \"name\" : \"Charlotte\",\n" +
                "      \"latitude\" : 35.227087,\n" +
                "      \"longitude\" : -80.843127,\n" +
                "      \"population\" : 809958,\n" +
                "      \"diseases\" : [11, 23, 12]\n" +
                "    },\n" +
                "        {\n" +
                "      \"name\" : \"Detroit\",\n" +
                "      \"latitude\" : 42.331427,\n" +
                "      \"longitude\" : -83.045754,\n" +
                "      \"population\" : 680250,\n" +
                "      \"diseases\" : [7, 15, 4]\n" +
                "    },\n" +
                "        {\n" +
                "      \"name\" : \"El Paso\",\n" +
                "      \"latitude\" : 31.761878,\n" +
                "      \"longitude\" : -106.485022,\n" +
                "      \"population\" : 679036,\n" +
                "      \"diseases\" : [34, 5, 10]\n" +
                "    },\n" +
                "        {\n" +
                "      \"name\" : \"Seattle\",\n" +
                "      \"latitude\" : 47.606209,\n" +
                "      \"longitude\" : -122.332071,\n" +
                "      \"population\" : 668342,\n" +
                "      \"diseases\" : [26, 8, 30]\n" +
                "    },\n" +
                "        {\n" +
                "      \"name\" : \"Denver\",\n" +
                "      \"latitude\" : 39.739236,\n" +
                "      \"longitude\" : -104.990251,\n" +
                "      \"population\" : 663862,\n" +
                "      \"diseases\" : [4, 8, 35]\n" +
                "    },\n" +
                "        {\n" +
                "      \"name\" : \"Washington\",\n" +
                "      \"latitude\" : 38.907192,\n" +
                "      \"longitude\" : -77.036871,\n" +
                "      \"population\" : 658893,\n" +
                "      \"diseases\" : [19, 6, 27]\n" +
                "    }\n" +
                "    ]\n" +
                "}";
}
